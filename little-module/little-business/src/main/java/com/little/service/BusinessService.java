package com.little.service;

/**
 * @Author: 山居
 * @CreateTime: 2024-08-20
 * @Description:
 * @Version: 1.0
 */

public interface BusinessService
{
    public void purchase(String userId, String commodityCode, int orderCount);
}
