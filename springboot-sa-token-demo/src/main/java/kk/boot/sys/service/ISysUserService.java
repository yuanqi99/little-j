package kk.boot.sys.service;

import kk.boot.pojo.BaseLoginUser;
import kk.boot.sys.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author shan
 * @since 2024-09-13
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 根据账户获取用户信息，查不到则返回null
     *
     * @author xuyuxiang
     * @date 2022/4/27 21:38
     */
    BaseLoginUser getUserByAccount(String account);

}
