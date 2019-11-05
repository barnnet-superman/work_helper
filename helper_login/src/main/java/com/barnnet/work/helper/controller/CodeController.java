package com.barnnet.work.helper.controller;

import com.barnnet.work.helper.entity.SendCode;
import com.barnnet.work.helper.util.redis.RedisHandler;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author barnnet
 * @date 2019/10/3
 */
@Api("发送验证码")

@Controller
public class CodeController {

    @Resource
    private RedisHandler redisHandler;

    @ApiImplicitParam(name = "手机号码",value ="手机号")
    @RequestMapping(value ="sendCode",method = RequestMethod.POST)
    public void sendCode(String phone,HttpServletRequest request, HttpServletResponse response, HttpSession session){
        try {
            String code = SendCode.sendCode();
            redisHandler.setString(phone+"code",code);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
