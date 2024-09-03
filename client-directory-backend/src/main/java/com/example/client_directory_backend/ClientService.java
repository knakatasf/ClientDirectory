package com.example.client_directory_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client insertClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getClientByFirstname(String firstname) {
        return clientRepository.findByFirstname(firstname);
    }

    public List<Client> getClientByLastname(String lastname) {
        return clientRepository.findByFirstname(lastname);
    }

    public List<Client> getClientByEmail(String email) {
        return clientRepository.findByFirstname(email);
    }

    public List<Client> getClientByPhoneNumber(String phoneNumber) {
        return clientRepository.findByFirstname(phoneNumber);
    }

    public List<Client> getClientByPartialAddress(String partialAddress) {
        return clientRepository.findByFirstname(partialAddress);
    }
}
