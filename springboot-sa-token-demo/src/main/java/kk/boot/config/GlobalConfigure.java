package kk.boot.config;

import cn.dev33.satoken.context.SaHolder;
import cn.dev33.satoken.filter.SaServletFilter;
import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.stp.StpInterface;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.json.JSONUtil;
import kk.boot.common.tools.AjaxJson;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 配置类
 *
 * @Author: 山居
 * @CreateTime: 2024-09-13
 * @Description:
 * @Version: 1.0
 */

@Configuration
@MapperScan(basePackages = {"kk.boot.**.mapping"})
public class GlobalConfigure implements WebMvcConfigurer
{

    private static final String CACHE_KEY_PREFIX = "Cache:";

    /**
     * 注册 Sa-Token 拦截器打开注解鉴权功能
     */

    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        // 注册注解拦截器，并排除不需要注解鉴权的接口地址 (与登录拦截器无关，只是说明哪些接口不需要被拦截器拦截，此处都拦截)
        registry.addInterceptor(new SaInterceptor()).addPathPatterns("/**");
    }



    /**
     * 注册 [Sa-Token 全局过滤器]
     */
    @Bean
    public SaServletFilter getSaServletFilter() {
        return new SaServletFilter()

                // 指定 [拦截路由] 与 [放行路由]
                .addInclude("/**")// .addExclude("/favicon.ico")

                // 认证函数: 每次请求执行
                .setAuth(obj -> {
                    // SaManager.getLog().debug("----- 请求path={}  提交token={}", SaHolder.getRequest().getRequestPath(), StpUtil.getTokenValue());

                })

                // 异常处理函数：每次认证函数发生异常时执行此函数
                .setError(e -> {
                    System.out.println("---------- sa全局异常 ");
                    return AjaxJson.getError(e.getMessage());
                })

                // 前置函数：在每次认证函数之前执行（BeforeAuth 不受 includeList 与 excludeList 的限制，所有请求都会进入）
                .setBeforeAuth(r -> {
                    // ---------- 设置一些安全响应头 ----------
                    SaHolder.getResponse()
                            // 服务器名称
                            .setServer("sa-server")
                            // 是否可以在iframe显示视图： DENY=不可以 | SAMEORIGIN=同域下可以 | ALLOW-FROM uri=指定域名下可以
                            .setHeader("X-Frame-Options", "SAMEORIGIN")
                            // 是否启用浏览器默认XSS防护： 0=禁用 | 1=启用 | 1; mode=block 启用, 并在检查到XSS攻击时，停止渲染页面
                            .setHeader("X-XSS-Protection", "1; mode=block")
                            // 禁用浏览器内容嗅探
                            .setHeader("X-Content-Type-Options", "nosniff")
                    ;
                })
                ;
    }
    /**
     * RedisTemplate序列化
     *
     * @author xuyuxiang
     * @date 2022/6/21 17:01
     **/
    @SuppressWarnings("ALL")
    @Primary
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringRedisSerializer);
        redisTemplate.setHashKeySerializer(stringRedisSerializer);
        Jackson2JsonRedisSerializer<?> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }


    /**
     * 权限认证接口实现类，集成权限认证功能
     **/
    @Component
    @RequiredArgsConstructor
    public static class StpInterfaceImpl implements StpInterface
    {
        private final RedisTemplate redisTemplate;


        @Override
        public List<String> getPermissionList(Object loginId, String loginType)
        {
            Object permissionList;
            permissionList = redisTemplate.boundValueOps(CACHE_KEY_PREFIX + loginId);
            return JSONUtil.parseArray(permissionList).toList(String.class);
        }

        @Override
        public List<String> getRoleList(Object loginId, String loginType)
        {
            Object o = StpUtil.getTokenSession().get("loginUser");
            return null;
        }
    }

}
