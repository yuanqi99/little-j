package com.little.factory;

import com.little.client.OrderApiService;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: 山居
 * @CreateTime: 2024-08-20
 * @Description:
 * @Version: 1.0
 */
@Component
public class OrderApiFallbackFactory implements FallbackFactory<OrderApiService>
{
    @Override
    public OrderApiService create(Throwable cause)
    {
        return new OrderApiService()
        {
            @Override
            public void create(String userId, String commodityCode, int orderCount)
            {
                System.out.println(" = 服务异常" );
            }
        };
    }
}
