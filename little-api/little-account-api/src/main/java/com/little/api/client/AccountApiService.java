package com.little.api.client;

import com.little.api.constants.ApiConstants;
import com.little.api.factory.AccountApiServiceFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = ApiConstants.NAME,fallback = AccountApiServiceFactory.class)
public interface AccountApiService
{

    @RequestMapping("/debit")
    void debit(@RequestParam String userId,@RequestParam int orderMoney);
}
