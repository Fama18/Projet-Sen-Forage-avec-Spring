package com.senforage.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senforage.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
