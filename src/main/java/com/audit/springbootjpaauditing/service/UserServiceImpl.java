package com.audit.springbootjpaauditing.service;

import com.audit.springbootjpaauditing.domain.User;
import com.audit.springbootjpaauditing.model.UserRequestDto;
import com.audit.springbootjpaauditing.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequestDto userRequestDto) {
        User user = new User(userRequestDto.getFullName(),userRequestDto.getAge(),userRequestDto.getEmail());
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
