package com.lyj.puredesign.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyj.puredesign.dto.UserDTO;
import com.lyj.puredesign.dto.UserPasswordDTO;
import com.lyj.puredesign.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 青哥哥
 * @since 2022-01-26
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

    void updatePassword(UserPasswordDTO userPasswordDTO);

    Page<User> findPage(Page<User> objectPage, String username, String email, String address);
}
