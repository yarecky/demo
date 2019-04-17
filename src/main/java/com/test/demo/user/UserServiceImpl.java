package com.test.demo.user;

import javax.transaction.Transactional;

import com.test.demo.dto.UserDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = convertToEntity(userDTO);        
        User savedUser = userRepository.save(user);
        return convertToDto(savedUser);
    }

    private UserDTO convertToDto(User user) {
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    private User convertToEntity(UserDTO userDTO) throws ParseException {
        User user = modelMapper.map(userDTO, User.class);
        return user;
    }

}