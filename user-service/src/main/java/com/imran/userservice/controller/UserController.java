package com.imran.userservice.controller;

import com.imran.userservice.entity.UserDetail;
import com.imran.userservice.service.UserService;
import com.imran.userservice.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserDetail")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/")
    public UserDetail saveUser(@RequestBody UserDetail UserDetail) {
        return userService.saveUser(UserDetail);
    }

    @GetMapping("{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") int id) {
        return userService.getUserWithDepartment(id);
    }
}
