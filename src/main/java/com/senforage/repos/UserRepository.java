package com.senforage.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senforage.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
