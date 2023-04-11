package com.audit.springbootjpaauditing.service;

import com.audit.springbootjpaauditing.domain.User;
import com.audit.springbootjpaauditing.model.UserRequestDto;

import java.util.List;

public interface UserService {

    User createUser(UserRequestDto userRequestDto);

    List<User> getUsers();
}
