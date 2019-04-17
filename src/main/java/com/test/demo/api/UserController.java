package com.test.demo.api;

import com.test.demo.dto.UserDTO;
import com.test.demo.user.UserService;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public UserDTO save(String name, String password) {

        String hashedPassword = DigestUtils.sha256Hex(name+password);
        return userService.save(new UserDTO(name, hashedPassword));
    }
}
