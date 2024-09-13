package kk.boot.auth.controller;

import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import kk.boot.auth.service.AuthService;
import kk.boot.common.tools.AjaxJson;
import kk.boot.pojo.param.AuthAccountPasswordParam;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 山居
 * @CreateTime: 2024-09-13
 * @Description:
 * @Version: 1.0
 */
@Tag(name = "认证控制器")
@ApiSupport(author = "山居", order = 6)
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@Validated
public class AuthController
{
    private final AuthService authService;

    @Operation(summary = "B端账号密码登录")
    @PostMapping("/doLogin")
    public AjaxJson doLogin(@RequestBody @Valid AuthAccountPasswordParam authAccountPasswordParam)
    {
        return AjaxJson.getSuccess().setData(authService.doLogin(authAccountPasswordParam));
    }

}
