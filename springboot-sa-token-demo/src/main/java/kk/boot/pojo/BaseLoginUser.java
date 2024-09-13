package kk.boot.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

/**
 * @Author: 山居
 * @CreateTime: 2024-09-13
 * @Description:
 * @Version: 1.0
 */
@Data
public class BaseLoginUser
{
    @Schema(description = "id")
    private String id;

    /** 租户id */
    @Schema(description = "租户id")
    private String tenantId;

    /**
     * 账号
     */
    @Schema(description = "账号")
    private String account;

    /** 头像 */
    @Schema(description = "头像")
    private String avatar;

    /**
     * 头像
     */
    @Schema(description = "头像")
    private String password;


    /** 角色码集合 */
    @Schema(description = "角色码集合", hidden = true)
    private List<String> roleCodeList;

}
