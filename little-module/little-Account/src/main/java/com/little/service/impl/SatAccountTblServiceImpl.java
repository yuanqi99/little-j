package com.little.service.impl;

import com.little.domain.SatAccountTbl;
import com.little.mapper.SatAccountTblMapper;
import com.little.service.ISatAccountTblService;
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
public class SatAccountTblServiceImpl extends ServiceImpl<SatAccountTblMapper, SatAccountTbl> implements ISatAccountTblService {

    @Override
    public void debit(String userId, int money)
    {

    }
}
