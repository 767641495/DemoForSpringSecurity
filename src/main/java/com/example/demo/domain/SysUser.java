package com.example.demo.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysUser implements Serializable {

    /** 用户ID */
    private Long userId;

    /** 用户账号 */
    private String userName;

    /** 密码 */
    private String password;
}
