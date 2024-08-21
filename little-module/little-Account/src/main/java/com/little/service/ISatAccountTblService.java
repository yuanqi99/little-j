package com.little.service;

import com.little.domain.SatAccountTbl;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author litte
 * @since 2024-08-20
 */
public interface ISatAccountTblService extends IService<SatAccountTbl> {
    /**
     * 从用户账户中借出
     */
    void debit(String userId, int money);
}
