package com.unicorn.smallProgram.dao.sys;

import com.unicorn.smallProgram.bean.sys.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysUserMapper {
    List<SysUser> selectByPrimaryKey(@Param("userId")Integer userId);
    List<SysUser> selectUser(SysUser record);


}