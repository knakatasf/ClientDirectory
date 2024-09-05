package com.example.client_directory_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClientController {
    private final LLMService llmService;
    private final ClientService clientService;

    @Autowired
    public ClientController(LLMService llmService, ClientService clientService) {
        this.llmService = llmService;
        this.clientService = clientService;
    }

    @PostMapping("/process")
    public String processInput(@RequestBody ClientRequest request) {
        return llmService.processInput(request.getAction(), request.getInput());
    }
}
