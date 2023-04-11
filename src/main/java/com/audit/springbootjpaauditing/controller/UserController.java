package com.audit.springbootjpaauditing.controller;

import com.audit.springbootjpaauditing.domain.User;
import com.audit.springbootjpaauditing.model.UserRequestDto;
import com.audit.springbootjpaauditing.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User create(@RequestBody UserRequestDto userRequestDto){
         return userService.createUser(userRequestDto);
    }

    @GetMapping("")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
