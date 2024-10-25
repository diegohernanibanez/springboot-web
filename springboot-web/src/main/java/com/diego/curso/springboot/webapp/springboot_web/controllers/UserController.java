package com.diego.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.diego.curso.springboot.webapp.springboot_web.models.User;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Diego", "Ibanez");

        model.addAttribute("title", "Hola Mundo");
        model.addAttribute("user", user);
        
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> userModel() {
        User user = new User("Pedro","Alfonso", "test1@mail.com");
        User user2 = new User("Mariano","Benitez", "test2@mail.com");
        User user3 = new User("Xiomara","Pereira");

        List<User> users = Arrays.asList(user, user2, user3);

        return users;
    }
    
}
