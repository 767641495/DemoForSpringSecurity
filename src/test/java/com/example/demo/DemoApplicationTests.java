package com.example.demo;

import com.example.demo.mapper.SysUserMapper;
import com.example.demo.service.Impl.UserDetailsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Test
    void contextLoads() {
//        //创建解析器
//        PasswordEncoder encoder = new BCryptPasswordEncoder();
//        //对密码进行加密
//        String password = encoder.encode( "123");
//        System. out .println( "------------"+password);
//        //判断原字符加密后和内容是否匹配
//        boolean result = encoder.matches( "123",password);
//        System. out .println( "============="+result);
    }

}
