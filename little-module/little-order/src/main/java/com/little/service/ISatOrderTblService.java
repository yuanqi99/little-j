package com.little.service;

import com.little.domain.SatOrderTbl;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author litte
 * @since 2024-08-20
 */
public interface ISatOrderTblService extends IService<SatOrderTbl> {
    /**
     * 创建订单
     */
    SatOrderTbl create(String userId, String commodityCode, int orderCount);
}
