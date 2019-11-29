package com.unicorn.smallProgram.service.sys.Impl;

import com.unicorn.smallProgram.bean.sys.SysUser;
import com.unicorn.smallProgram.config.DS;
import com.unicorn.smallProgram.config.DataSourceType;
import com.unicorn.smallProgram.dao.sys.SysUserMapper;
import com.unicorn.smallProgram.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户信息服务
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 查询所有系统用户管理信息
     * @return
     */
    @Override
    @DS(value = DataSourceType.mysqlDS)
    public List<SysUser> selectUser(SysUser user) {
        //return sysUserMapper.selectUser(user);
        return sysUserMapper.selectByPrimaryKey(user.getUserId());
    }



}
