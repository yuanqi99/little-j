package com.little.client;

import com.little.constants.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = ApiConstants.NAME)
public interface StorageApiService
{
}
