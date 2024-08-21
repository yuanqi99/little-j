package com.little.controller;

import com.little.service.ISatStorageTblService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author litte
 * @since 2024-08-20
 */
@Controller
@RequestMapping("/satStorageTbl")
@AllArgsConstructor
public class SatStorageTblController {

    private final ISatStorageTblService storageTblService;


}
