package com.example.ecommeceapi.repository;

import com.example.ecommeceapi.model.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, Integer> {

    user findByIdentifiant(String identifiant);
}
