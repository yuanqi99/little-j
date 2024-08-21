package com.little.service.impl;

import com.little.client.OrderApiService;
import com.little.client.StorageApiService;
import com.little.service.BusinessService;

public class BusinessServiceImpl implements BusinessService
{

    private StorageApiService storageService;

    private OrderApiService orderService;

    /**
     * 采购
     */
    public void purchase(String userId, String commodityCode, int orderCount) {

        storageService.deduct(commodityCode, orderCount);

        orderService.create(userId, commodityCode, orderCount);
    }
}