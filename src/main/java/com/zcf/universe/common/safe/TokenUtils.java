package com.zcf.universe.common.safe;

import com.zcf.universe.common.utils.DesUtils;

/**
 * 封装token
 * six
 */
public class TokenUtils {
    public static final String MODDLE = "D_X";

    /**
     * 加密用户名+D_X+id
     *
     * @param uid
     * @param username
     */
    public static String makeToken(Long uid, String username) {
        String id = uid.toString();
        String source = username + MODDLE + id;
        String lastStr = "";
        try {
            lastStr = DesUtils.encrypt(source);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lastStr;
    }

}
