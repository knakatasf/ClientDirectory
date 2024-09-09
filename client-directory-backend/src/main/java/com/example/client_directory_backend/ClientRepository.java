package com.example.client_directory_backend;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

    List<Client> findByNameLike(String name);
    List<Client> findByEmail(String email);
    List<Client> findByPhoneNumber(String phoneNumber);
    List<Client> findByAddressLike(String partialAddress);
}
