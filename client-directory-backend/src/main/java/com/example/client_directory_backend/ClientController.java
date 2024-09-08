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

//    @PostMapping("/process")
//    public String processClientRequest(@RequestParam("action") String action, @RequestBody String input) {
//        // Use LLMService to extract client data from the input
//        ExtractedData extractedData = llmService.processInput(input);
//
//        // Based on action, invoke ClientService methods
//        switch (action.toLowerCase()) {
//            case "insert":
//                return clientService.insertClient(extractedData);
//            case "lookup":
//                return clientService.lookupClient(extractedData);
//            case "update":
//                return clientService.updateClient(extractedData);
//            default:
//                return "Invalid action!";
//        }
//    }
}
