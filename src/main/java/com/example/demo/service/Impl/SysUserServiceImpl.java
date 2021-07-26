package com.example.demo.service.Impl;

import com.example.demo.domain.SysUser;
import com.example.demo.service.ISysUserService;
import com.example.demo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser selectUserByUserName(String userName) {
       return sysUserMapper.selectUserByUserName(userName);
    }
}
