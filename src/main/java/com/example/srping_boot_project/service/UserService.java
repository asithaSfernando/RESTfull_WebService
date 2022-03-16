package com.example.srping_boot_project.service;

import com.example.srping_boot_project.dto.UserDTO;
import com.example.srping_boot_project.entity.User;
import com.example.srping_boot_project.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){

        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;

    }

    public List<UserDTO> getAllUsers(){

        List<User> userList = userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());

    }

    public UserDTO updateUser(UserDTO userDTO){

       userRepo.save(modelMapper.map(userDTO,User.class));
       return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){

        userRepo.delete(modelMapper.map(userDTO, User.class));
        return true;
    }

}
