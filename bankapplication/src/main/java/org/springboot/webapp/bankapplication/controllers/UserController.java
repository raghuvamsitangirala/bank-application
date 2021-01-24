package org.springboot.webapp.bankapplication.controllers;

import org.springboot.webapp.bankapplication.models.User;
import org.springboot.webapp.bankapplication.repositories.UserRepository;
import org.springboot.webapp.bankapplication.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        List<User> users = userService.GetUsers();
        return users;
    }

//    @GetMapping("/users/{id}")
//    public List<User> getUser(@PathVariable (value = "id") Long UserId) {
//        List<User> users = userService.GetUsers();
//        List<User> requiredUser = userRepository.findById(UserId);
//        for(int i = 0; i < users.size(); i++){
//            if(users.get(i) == requiredUser){
//
//            }
//        }
//
//        return users;
//    }
}
