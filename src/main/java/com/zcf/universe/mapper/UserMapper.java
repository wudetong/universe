package com.zcf.universe.mapper;

import com.zcf.universe.common.mybatis.MyMapper;
import com.zcf.universe.entity.User;
import com.zcf.universe.vo.out.UserVo;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends MyMapper<User> {
    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
//     */
//    UserVo login(@Param("username") String username, @Param("password") String password);
}
