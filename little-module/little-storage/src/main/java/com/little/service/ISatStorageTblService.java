package com.little.service;

import com.little.domain.SatStorageTbl;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author litte
 * @since 2024-08-20
 */
public interface ISatStorageTblService extends IService<SatStorageTbl> {
    /**
     * 扣除存储数量
     */
    void deduct(String commodityCode, int count);
}
