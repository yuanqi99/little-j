package com.little.service.impl;

import com.little.domain.SatStorageTbl;
import com.little.mapper.SatStorageTblMapper;
import com.little.service.ISatStorageTblService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author litte
 * @since 2024-08-20
 */
@Service
public class SatStorageTblServiceImpl extends ServiceImpl<SatStorageTblMapper, SatStorageTbl> implements ISatStorageTblService {

    @Override
    public void deduct(String commodityCode, int count)
    {

    }
}
