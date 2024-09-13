package kk.boot.pojo.db;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class SysUserInfo
{


    /** id */
    @Schema(description = "id")
    private String id;

    /** 头像 */
    @Schema(description = "头像")
    private String avatar;

    /** 签名 */
    @Schema(description = "签名")
    private String signature;

    /** 账号 */
    @Schema(description = "账号")
    private String account;
    /** 姓名 */
    @Schema(description = "姓名")
    private String name;

    /** 昵称 */
    @Schema(description = "昵称")
    private String nickname;

    /** 按钮码集合 */
    @Schema(description = "按钮码集合")
    private List<String> buttonCodeList;

    /** 移动端按钮码集合 */
    @Schema(description = "移动端按钮码集合")
    private List<String> mobileButtonCodeList;

    /** 权限码集合 */
    @Schema(description = "权限码集合", hidden = true)
    private List<String> permissionCodeList;

    /** 角色码集合 */
    @Schema(description = "角色码集合", hidden = true)
    private List<String> roleCodeList;

    /** 用户密码hash值 */
    @JsonIgnore
    @Schema(description = "用户密码hash值")
    private String password;
}
