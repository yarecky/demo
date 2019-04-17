package com.test.demo.user;

import java.util.List;

import com.test.demo.dto.UserDTO;

public interface UserService {

	List<UserDTO> list();

	UserDTO save(UserDTO userDTO);
}