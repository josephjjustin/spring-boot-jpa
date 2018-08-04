package com.jcube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jcube.model.Users;

@Component
public interface UserJpaRespository extends JpaRepository<Users, Long>{

    Users findByName(String name);
}
