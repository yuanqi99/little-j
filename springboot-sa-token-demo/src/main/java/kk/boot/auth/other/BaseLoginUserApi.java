package kk.boot.auth.other;

import kk.boot.pojo.BaseLoginUser;

/**
 *
 * 登录用户API，由其他模块实现
 * @Author: 山居
 * @CreateTime: 2024-09-13
 * @Description:
 * @Version: 1.0
 */

public interface BaseLoginUserApi
{

    /**
     * 根据账号获取B端用户信息，查不到则返回null
     *
     * @author xuyuxiang
     * @date 2022/3/10 16:14
     **/
    BaseLoginUser getUserByAccount(String account);
}
