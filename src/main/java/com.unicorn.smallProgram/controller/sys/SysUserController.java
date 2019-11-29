package com.unicorn.smallProgram.controller.sys;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.unicorn.smallProgram.bean.sys.SysUser;
import com.unicorn.smallProgram.dto.HttpResult;
import com.unicorn.smallProgram.globle.HttpResponseParam;
import com.unicorn.smallProgram.service.sys.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    private Logger logger = LoggerFactory.getLogger(SysUserController.class);

    /**
     * c查询
     * @param userId
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public HttpResult queryUser(@RequestParam("userId") Integer userId) {  //注册
        HttpResult httpResult = null;
        try {
            SysUser sysUser = new SysUser();
            sysUser.setUserId(userId);
            List<SysUser> sysUsers = sysUserService.selectUser(sysUser);
            httpResult = new HttpResult(HttpResponseParam.SUCCESS_CODE,HttpResponseParam.SUCCESS_MSG,sysUsers);
        } catch (Exception e) {
            httpResult = new HttpResult(HttpResponseParam.FAIL_CODE,HttpResponseParam.FAIL_INSERT_MSG);
            logger.error("添加用户错误",e);
        }
        return httpResult;
    }







}
