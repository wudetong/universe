package com.zcf.universe.service;

import com.github.pagehelper.PageHelper;
import com.zcf.universe.common.json.Body;
import com.zcf.universe.common.result.PageResult;
import com.zcf.universe.common.result.ResultVo;
import com.zcf.universe.entity.User;
import com.zcf.universe.mapper.UserMapper;
import com.zcf.universe.vo.in.PageVo;
import com.zcf.universe.vo.out.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
//    public Body login(String username, String password) {
//        UserVo user = userMapper.login(username, password);
//        if (user == null) {
//            return Body.newInstance(542, "用户不存在");
//        }
//        logger.info("= = = 》 {}用户登录成功", user.getUserName());
//        return Body.newInstance(user);
//    }
//
//    /**
//     * 分页查询
//     *
//     * @param param
//     * @return
//     */
//    public Body findList(PageVo param) {
//        if (param.getPage() != null && param.getPageSize() != null) {
//            PageHelper.startPage(param.getPage(), param.getPageSize());
//        }
//        List<User> list = userMapper.selectAll();
//        // 自动分页
//        PageResult result = PageResult.result(list);
//        // 返回的vo
//        ResultVo resultVo = new ResultVo();
//        // 返回总条数
//        resultVo.setTotal(result.getTotal());
//        // 返回结果集合
//        resultVo.setList(result.getRows());
//        return Body.newInstance(resultVo);
//    }
}
