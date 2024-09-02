package com.example.client_directory_backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    void insertClient(String name, String email, String phoneNumber, String address);
    List<Client> findClientByName(String name);
    List<Client> findClientByEmail(String email);

}
