package com.example.client_directory_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Client processClientRequest(@RequestParam("action") String action, @RequestBody String input) {
        /*
        Client client = llmService.processInput(input);

        switch (action.toLowerCase()) {
            case "insert":
                return clientService.insertClient(client);

            case "lookup"
                return clientService.lookupClient(extractedData);
            case "update":
                return clientService.updateClient(extractedData);

            default:
                return null;

         */
        return null;
        }
    }
}
