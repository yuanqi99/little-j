package com.little;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    //先普通的注入一个userService bean


    @Test
    public void getUserById() throws Exception {
        //普通的使用userService，他里面会再去调用userDao取得数据库的数据

    }
}