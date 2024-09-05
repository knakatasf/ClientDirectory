package com.example.client_directory_backend;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
public class LLMService {
    private final ClientService clientService;

    public LLMService(ClientService clientService) {
        this.clientService = clientService;
    }

    public static void main(String[] args) {
        ChatLanguageModel cl = OpenAiChatModel.withApiKey("demo");
        String answer = cl.generate("Explain the benefits of using LangChain4j.");
        System.out.println(answer);
    }

    public String processInput(String action, String input) {

        return "";
    }
}
