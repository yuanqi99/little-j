package com.little.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author litte
 * @since 2024-08-20
 */
@TableName("sat_order_tbl")
@Data
public class SatOrderTbl implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer money;

    @Override
    public String toString() {
        return "SatOrderTbl{" +
            "id = " + id +
            ", userId = " + userId +
            ", commodityCode = " + commodityCode +
            ", count = " + count +
            ", money = " + money +
        "}";
    }
}
