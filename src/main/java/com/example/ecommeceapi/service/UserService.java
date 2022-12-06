package com.example.ecommeceapi.service;

import com.example.ecommeceapi.model.user;
import com.example.ecommeceapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return new User("admin", "password", new ArrayList<>());
    }

    public user saveUser(user user) {
        return repository.save(user);
    }

    public List<user> getUsers() {
        return repository.findAll();
    }

    public user getUserById(int id) {
        return repository.findById(id).orElse(null);
    }


    public user getUserbyIdentifiant(String identifiant) {
        return repository.findByIdentifiant(identifiant);
    }


    public String deleteUser(int id) {
        repository.deleteById(id);
        return "Utlisiateur supprimer avec succés";
    }


}
