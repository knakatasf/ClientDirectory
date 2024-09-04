package com.example.client_directory_backend;

import org.springframework.stereotype.Service;

@Service
public class LLMService {
    private final ClientService clientService;

    public LLMService(ClientService clientService) {
        this.clientService = clientService;
    }
}
