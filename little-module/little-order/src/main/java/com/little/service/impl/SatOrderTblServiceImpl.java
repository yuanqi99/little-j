package com.little.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.little.api.client.AccountApiService;
import com.little.domain.SatOrderTbl;
import com.little.mapper.SatOrderTblMapper;
import com.little.service.ISatOrderTblService;
import io.seata.core.context.RootContext;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author litte
 * @since 2024-08-20
 */
@Service
@AllArgsConstructor
@Slf4j
public class SatOrderTblServiceImpl extends ServiceImpl<SatOrderTblMapper, SatOrderTbl> implements ISatOrderTblService {

//    private static final Logger LOGGER = LoggerFactory.getLogger(ISatOrderTblService.class);

    private final  AccountApiService accountApiService;
    private final JdbcTemplate jdbcTemplate;
    @Override
    public SatOrderTbl create(String userId, String commodityCode, int orderCount)
    {
        log.info("Order Service Begin ... xid: " + RootContext.getXID());

        // 计算订单金额
        int orderMoney = calculate(commodityCode, orderCount);

        // 从账户余额扣款
        accountApiService.debit(userId, orderMoney);

        log.info(
                "Order Service SQL: insert into order_tbl (user_id, commodity_code, count, money) values ({}, {}, {}, {})",
                userId, commodityCode, orderCount, orderMoney);

        KeyHolder keyHolder = new GeneratedKeyHolder();
//        jdbcTemplate.update(con -> {
//            PreparedStatement pst = con.prepareStatement(
//                    "insert into order_tbl (user_id, commodity_code, count, money) values (?, ?, ?, ?)",
//                    PreparedStatement.RETURN_GENERATED_KEYS);
//            pst.setObject(1, userId);
//            pst.setObject(2, commodityCode);
//            pst.setObject(3, orderCount);
//            pst.setObject(4, orderMoney);
//            return pst;
//        }, keyHolder);

        return null;
    }

    private int calculate(String commodityId, int orderCount) {
        return 200 * orderCount;
    }

}
