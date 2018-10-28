package com.zcf.universe.service;

import com.zcf.universe.common.safe.TokenUtils;
import com.zcf.universe.common.utils.DesUtils;
import com.zcf.universe.entity.User;
import com.zcf.universe.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 公共服务service
 */
@Service
public class CommonService {

    private static final Logger logger = LoggerFactory.getLogger(CommonService.class);

    @Autowired
    private UserMapper userMapper;

    private String MODDLES = TokenUtils.MODDLE;

    /**
     * 验证token 是否有效
     *
     * @param token
     * @return
     */
    public Boolean checkToken(String token) {
        try {
            String str = DesUtils.decrypt(token);
            // 解密id
            String id = str.substring(str.indexOf(MODDLES) + MODDLES.length(), str.length());
            // 解密用户名或者id
            String userNameOrId = str.substring(0, str.indexOf(MODDLES));
            // 解析字符 生成token
            String sourceToken = TokenUtils.makeToken(Long.parseLong(id), userNameOrId);
            if (!token.equals(sourceToken)) {
                return false;
            }
            // 验证用户有效性
            User user = userMapper.selectByPrimaryKey(Long.parseLong(id));
            if (user == null) {
                return false;
            }
            // 截取用户名和id
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("{}验证token异常!" + token);
            return false;
        }
        return true;
    }

    /**
     * 根据token 获取用户id
     *
     * @param token
     * @return
     */
    public Long getUserIdByToken(String token) {
        String id = null;
        try {
            String str = DesUtils.decrypt(token);
            // 解密id
            id = str.substring(str.indexOf(MODDLES) + MODDLES.length(), str.length());
            // 截取用户名和id
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            logger.info("{}解析token异常!" + token);
            return null;
        }
        return Long.parseLong(id);
    }
}
