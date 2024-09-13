package kk.boot.auth.service.impl;

import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.util.ObjectUtil;
import kk.boot.auth.service.AuthService;
import kk.boot.auth.other.BaseLoginUserApi;
import kk.boot.config.GlobalException;
import kk.boot.pojo.BaseLoginUser;
import kk.boot.pojo.param.AuthAccountPasswordParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Author: 山居
 * @CreateTime: 2024-09-13
 * @Description:
 * @Version: 1.0
 */
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService
{

    private final BaseLoginUserApi loginUserApi;

    @Override
    public String doLogin(AuthAccountPasswordParam auth)
    {
        // 获取账号
        String account = auth.getAccount();
        // 获取密码
        String password = auth.getPassword();
        //TODO 加密解密

        // 获取loginUserApi
        BaseLoginUser baseLoginUser = loginUserApi.getUserByAccount(account);
        if(ObjectUtil.isEmpty(baseLoginUser)) {
            throw new GlobalException("账号错误");
        }
        if (!baseLoginUser.getPassword().equals(auth.getPassword())) {
            // 记录登录次数 和 过期时间
            // saveLoginTimes(account);
            throw new GlobalException("密码错误");
        }

        return execLogin(baseLoginUser);
    }

    /**
     * 执行登陆
     * @param baseLoginUser
     * @return
     */
    private String execLogin(BaseLoginUser baseLoginUser){
        StpUtil.login(baseLoginUser.getId());
        fillSaBaseLoginUserAndUpdateCache(baseLoginUser);
        return StpUtil.getTokenInfo().tokenValue;
    }

    /**
     * 权限集合
     * @param baseLoginUser
     */
    private void fillSaBaseLoginUserAndUpdateCache(BaseLoginUser baseLoginUser)
    {

    }
}
