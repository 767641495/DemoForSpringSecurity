package com.example.demo.service;

import com.example.demo.domain.SysUser;

public interface ISysUserService {
    public SysUser selectUserByUserName(String userName);
}
