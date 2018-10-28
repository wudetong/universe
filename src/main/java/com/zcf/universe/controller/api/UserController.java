package com.zcf.universe.controller.api;

import com.zcf.universe.common.json.Body;
import com.zcf.universe.common.utils.UploadImgUtils;
import com.zcf.universe.service.UserService;
import com.zcf.universe.vo.in.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

//  userService  /**
//     * 登录
//     *
//     * @param username
//     * @param password
//     * @return
//     */
//    @PostMapping("/login")
//    public Body login(String username, String password) {
//        return userService.login(username, password);
//    }
//
//    /**
//     * 公共上传文件
//     *
//     * @param file
//     * @return
//     */
//    @PostMapping("/common/upload")
//    public Body upload(@RequestParam(required = false, name = "file") MultipartFile[] file) {
//        String imgUrl = null;
//        try {
//            imgUrl = UploadImgUtils.uploadFiles(file);
//        } catch (Exception e) {
//            return Body.BODY_500;
//        }
//        return Body.newInstance(imgUrl);
//    }
//
//    /**
//     * 分页查询所有用户信息
//     * @param param
//     * @return
//     */
//    @GetMapping("/users")
//    public Body findList(PageVo param) {
//        return userService.findList(param);
//    }
}
