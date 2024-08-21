package com.little.client;

import com.little.constants.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = ApiConstants.NAME)
public interface StorageApiService
{

    @RequestMapping("/storage/edit")
    void deduct(@RequestParam String commodityCode, @RequestParam int orderCount);
}
