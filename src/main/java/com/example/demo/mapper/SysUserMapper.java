package com.example.demo.mapper;

import com.example.demo.domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {
    public SysUser selectUserByUserName(String userName);
}
