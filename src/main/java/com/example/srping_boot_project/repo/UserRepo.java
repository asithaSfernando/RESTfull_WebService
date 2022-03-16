package com.example.srping_boot_project.repo;

import com.example.srping_boot_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<User,Integer> {


}
