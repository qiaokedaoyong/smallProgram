package com.unicorn.smallProgram.globle;

public class HttpResponseParam {

    public static final int SUCCESS_CODE = 1; //请求成功

    public static final int FAIL_CODE = 0;//请求失败

    public static final int NO_DATA_CODE = 2;//查询无数据

    public static final int LOGIN_USERNAME_CODE = 2; //该账户不存在

    public static final int LOGIN_PASSWORD_CODE = 3; //密码错误

    public static final int LOGIN_ISENABLE_CODE = 4; //用户不可用

    public static final int NAME_EXISTED_CODE = 5;//用户名已存在

    public static final int NAME_PASSWD_ERROR_CODE = 6;//用户名或者密码错误

    public static final int ROLE_NAME_ERROR_CODE = 7;//角色名已存在

    public static final int ROLE_CODE_ERROR_CODE = 8;//角色代码已存在

    public static final int WORD_INSERT_DUPLICATTED_CODE = 9;//新增字段已存在

    public static final String WORD_INSERT_DUPLICATTED_MSG = "新增词语已存在";//新增词语已存在

    public static final int RULE_INSERT_DUPLICATTED_CODE = 10;//新增字段已存在

    public static final int SESSION_EXPIRE_CODE = 11; //会话已过期

    public static final String SESSION_EXPIRE_MSG = "会话已过期";//会话已过期提示

    public static final String RULE_INSERT_DUPLICATTED_MSG = "新增规则已存在";//新增规则已存在

    public static final String NO_DATA_MSG = "暂无数据";

    public static final String LOGIN_USERNAME_MSG = "该账户不存在";

    public static final String LOGIN_PASSWORD_MSG = "密码错误";

    public static final String LOGIN_ISENABLE_MSG = "账户不可用";

    public static final String SUCCESS_MSG = "success";

    public static final String FAIL_MSG = "fail";

    public static final String SUCCESS_LOG_MSG = "登录成功";

    public static final String FAIL_FAIL_MSG = "登录失败";

    public static final String SUCCESS_INSERT_MSG = "添加成功";

    public static final String FAIL_INSERT_MSG = "添加失败";

    public static final String SUCCESS_UPDATE_MSG = "修改成功";

    public static final String FAIL_UPDATE_MSG = "修改失败";

    public static final String SUCCESS_DELETE_MSG = "删除成功";

    public static final String FAIL_DELETE_MSG = "删除失败";

    public static final String NAME_EXISTED_MSG = "用户名已存在";

    public static final String NAME_PASSWD_ERROR_MSG = "用户名或者密码错误";

    public static final String ROLE_NAME_ERROR_MSG = "角色名已存在";

    public static final String ROLE_CODE_ERROR_MSG = "角色代码已存在";
    public static final String INSERT_ROAD_DUPLICATED_MSG = "该路段已添加";
    public static final String INSERT_ROAD_MAX_MSG = "添加路段已达6个，不可添加";
}
