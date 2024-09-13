package kk.boot.auth.other.Impl;

import kk.boot.auth.other.BaseLoginUserApi;
import kk.boot.pojo.BaseLoginUser;
import kk.boot.sys.service.ISysUserService;
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
public class LoginUserServiceImpl implements BaseLoginUserApi
{

    private final ISysUserService sysUserService;

    @Override
    public BaseLoginUser getUserByAccount(String account)
    {
        return sysUserService.getUserByAccount(account);
    }
}
