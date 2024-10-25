package com.diego.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.curso.springboot.webapp.springboot_web.models.User;
import com.diego.curso.springboot.webapp.springboot_web.models.dto.UserDto;


@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("Diego", "Ibanez");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo");

        return userDto;
    }

    @GetMapping("/lists")
    public List<User> list(){
        User user = new User("Name1","Test1");
        User user2 = new User("Name2","Test2");
        User user3 = new User("Name3","Test3");

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        
        List<User> users = Arrays.asList(user, user2, user3);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Diego", "Ibanez");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo");
        body.put("user", user);

        return body;
    }

    
}