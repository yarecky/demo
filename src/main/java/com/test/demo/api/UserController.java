package com.test.demo.api;

import java.util.List;

import com.test.demo.dto.UserDTO;
import com.test.demo.user.UserService;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public @ResponseBody List<UserDTO> getUsers() {
        return userService.list();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody UserDTO save(String name, String password) {
        String hashedPassword = DigestUtils.sha256Hex(name+password);
        return userService.save(new UserDTO(name, hashedPassword));
    }
}
