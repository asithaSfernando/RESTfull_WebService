package com.example.srping_boot_project.controller;

import com.example.srping_boot_project.dto.UserDTO;
import com.example.srping_boot_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v/user")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUser(){

        return userService.getAllUsers();

    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){

        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){

        return userService.deleteUser(userDTO);
    }


}
