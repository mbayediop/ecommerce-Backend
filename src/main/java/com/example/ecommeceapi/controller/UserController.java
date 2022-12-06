package com.example.ecommeceapi.controller;


import com.example.ecommeceapi.model.user;
import com.example.ecommeceapi.service.UserService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/adduser")
    public user addusser(@RequestBody user user) {
        return service.saveUser(user);
    }

    @GetMapping("/users")
    public List<user> findAllUsers() {
        return service.getUsers();
    }

    @GetMapping("/user/{id}")
    public user findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }


    @GetMapping("/useridentifiant/{identifiant}")
    public user findUserByIdentifiant(@PathVariable String identifiant) {
        return service.getUserbyIdentifiant(identifiant);
    }


    @DeleteMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }


    @RolesAllowed("USER")
    @RequestMapping("/*")
    public String getUser() {
        return "Welcome User";
    }


    @RolesAllowed({"USER", "ADMIN"})
    @RequestMapping("/admin")
    public String getAdmin() {
        return "Welcome Admin";
    }
}
