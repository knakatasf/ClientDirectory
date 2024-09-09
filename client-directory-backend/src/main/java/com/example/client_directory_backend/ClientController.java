package com.example.client_directory_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ClientController {
    private final LLMService llmService;
    private final ClientService clientService;

    @Autowired
    public ClientController(LLMService llmService, ClientService clientService) {
        this.llmService = llmService;
        this.clientService = clientService;
    }

    @PostMapping("/process")
    public ResponseEntity<String> processClientRequest(@RequestBody Map<String, String> payload) {
        String action = payload.get("action");
        String input = payload.get("input");

        if (action.toLowerCase().equals("insert")) {
            Client client = llmService.extractClient(input);
            clientService.insertClient(client);
            System.out.println("Insertion successful!");
            return ResponseEntity.ok("Insertion successful!");
        } else {
            System.out.println("Still implementing..");
            return null;
        }
    }
}
