package com.yanll.console.auth.controller;


import com.yanll.business.auth.domain.UserBeanVO;
import com.yanll.business.auth.service.IAuthService;
import com.yanll.framework.util.exception.BizCode;
import com.yanll.framework.web.result.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by YANLL on 2016/08/29.
 */
@RestController
@RequestMapping(value = "/auth", name = "权限管理模块控制器")
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
    @Autowired
    IAuthService authService;

    @RequestMapping(value = "/login", name = "用户登录")
    @ResponseBody
    public JSON login() {
        UserBeanVO vo = authService.login("admin", "admin");
        return new JSON(BizCode.OK.getValue(), vo);
    }
}

