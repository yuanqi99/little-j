package kk.boot.config;

import cn.hutool.core.util.StrUtil;

/**
 * @Author: 山居
 * @CreateTime: 2024-09-13
 * @Description:
 * @Version: 1.0
 */

public class GlobalException extends RuntimeException
{
    private Integer code;

    private String msg;

    public GlobalException() {
        super("服务器异常");
        this.code = 500;
        this.msg = "服务器异常";
    }

    public GlobalException(String msg, Object... arguments) {
        super(StrUtil.format(msg, arguments));
        this.code = 500;
        this.msg = StrUtil.format(msg, arguments);
    }

    public GlobalException(Integer code, String msg, Object... arguments) {
        super(StrUtil.format(msg, arguments));
        this.code = code;
        this.msg = StrUtil.format(msg, arguments);
    }
}
