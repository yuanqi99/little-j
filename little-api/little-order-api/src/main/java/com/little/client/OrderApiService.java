package com.little.client;

import com.little.constants.ApiConstants;
import com.little.factory.OrderApiFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = ApiConstants.NAME,fallback = OrderApiFallbackFactory.class)
public interface OrderApiService
{
    @RequestMapping("/order/create")
    void create(@RequestParam String userId, @RequestParam String commodityCode, @RequestParam int orderCount);
}
