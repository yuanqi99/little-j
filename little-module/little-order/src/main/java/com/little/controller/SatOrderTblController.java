package com.little.controller;

import com.little.service.ISatOrderTblService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/satOrderTbl")
@AllArgsConstructor
public class SatOrderTblController {

    private final ISatOrderTblService orderTblService;


}
