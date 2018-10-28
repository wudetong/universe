package com.zcf.universe;

import com.zcf.universe.entity.User;
import com.zcf.universe.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UniverseApplicationTests {
    @Autowired
    private UserMapper userMapper;

//    @Test
//    public void contextLoads() {
//       /* User user = new User();
//        user.setUserName("tom");
//        user.setPassword("222222");
//        user.setNickName("北鼻萨拉他二舅");
//        user.setCreateTime(new Date());
//        int count = userMapper.insert(user);
//        System.out.println("更新状态条目：" + count);*/
//        List<User> list = userMapper.selectAll();
//        for (User u : list) {
//            System.out.println("昵称：" + u.getNickName());
//            System.out.println("用户名:" + u.getUserName());
//            System.out.println("密码：" + u.getPassword());
//            System.out.println("创建时间：" + u.getCreateTime());
//        }
//    }

}

