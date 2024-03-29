package com.barnnet.work.helper.controller;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author barnnet
 * @date 2019/10/11
 */
@RestController
public class TestController {
    @Autowired
    private StringEncryptor encryptor;

    /**
     * 测试jasypt加密解密
     */
    @GetMapping("/jasypt")
    public void testJasypt() {
        String password = "123456";
        String encryptPwd = encryptor.encrypt(password);
        System.out.println("加密:：" + encryptPwd);
        System.out.println("解密：" + encryptor.decrypt(encryptPwd));
    }

    @Value("${spring.datasource.password}")
    private String dbPassword; // 数据库密码

    /**
     * 测试配置文件字段加密后，项目中该字段的值
     */
    @GetMapping("/password")
    public String password() {
        return dbPassword;
    }
}
