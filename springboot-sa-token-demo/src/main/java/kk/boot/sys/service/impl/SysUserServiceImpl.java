package kk.boot.sys.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import kk.boot.pojo.BaseLoginUser;
import kk.boot.sys.entity.SysUser;
import kk.boot.sys.mapping.SysUserMapper;
import kk.boot.sys.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author shan
 * @since 2024-09-13
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public BaseLoginUser getUserByAccount(String account)
    {
        LambdaQueryWrapper<SysUser> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(SysUser::getAccount,account);
        SysUser sysUser = this.getOne(wrapper);
        if (ObjectUtil.isNotEmpty(sysUser)) {
            return BeanUtil.copyProperties(sysUser, BaseLoginUser.class);
        }
        return null;
    }
}
