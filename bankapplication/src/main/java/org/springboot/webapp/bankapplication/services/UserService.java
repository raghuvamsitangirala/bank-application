package org.springboot.webapp.bankapplication.services;

import org.springboot.webapp.bankapplication.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> GetUsers()
    {


        User user = new User("user_123", "Raj", "Jar", "raj@gmail.com");
        User user2 = new User("user_243", "Raj1", "Jar1", "raj1@gmail.com");
        User user3 = new User("user_345", "Raj2", "Jar2", "raj2@gmail.com");
        User user4 = new User("user_456","Raj3", "Jar3", "raj3@gmail.com");

        List<User> usersList = new ArrayList<>();
        usersList.add(user);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);

        return usersList;
    }
}
