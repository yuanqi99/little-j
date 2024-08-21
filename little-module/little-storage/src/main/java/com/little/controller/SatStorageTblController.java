package com.little.controller;

import com.little.service.ISatStorageTblService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author litte
 * @since 2024-08-20
 */
@RestController
@RequestMapping("/storage")
@AllArgsConstructor
public class SatStorageTblController {

    private final ISatStorageTblService storageTblService;


    @RequestMapping("edit")
    public void edit( @RequestParam String commodityCode, @RequestParam int orderCount){
        storageTblService.deduct(commodityCode,orderCount);
        System.out.println("satStorageTbl ======== " + commodityCode);
    }

}
