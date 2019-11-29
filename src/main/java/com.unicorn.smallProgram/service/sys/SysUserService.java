package com.unicorn.smallProgram.service.sys;

import com.unicorn.smallProgram.bean.sys.SysUser;
import java.util.List;

public interface SysUserService {
    List<SysUser> selectUser(SysUser user);

}
