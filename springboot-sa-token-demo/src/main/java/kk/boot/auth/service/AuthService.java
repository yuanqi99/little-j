package kk.boot.auth.service;

import kk.boot.pojo.param.AuthAccountPasswordParam;

public interface AuthService
{

    public String doLogin(AuthAccountPasswordParam auth);
}
