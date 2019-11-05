package com.barnnet.work.helper.bean.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author barnnet
 * @date 2019/9/28
 */
@Data
public class LoginInfo implements Serializable {
    private static final long serialVersionUID = 113323427779853001L;
    @NotNull
    @ApiModelProperty(name = "ip")
    private String ip;

    @NotNull
    @ApiModelProperty(name = "手机号码")
    private String phone;

    @NotNull
    @ApiModelProperty(name = "验证码")
    private String confirmCode;
}
