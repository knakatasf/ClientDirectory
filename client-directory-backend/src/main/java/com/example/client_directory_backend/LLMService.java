package com.example.client_directory_backend;


import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.*;
import keys.ApiKeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LLMService {
    ChatLanguageModel model = OpenAiChatModel.withApiKey(ApiKeys.API_KEY_OPEN_AI);

    interface ClientExtractor {
        @UserMessage("Extract information about a client from {{it}}")
        Client extractClientFrom(String text);
    }

    Client extractClient(String input) {
        ClientExtractor extractor = AiServices.create(ClientExtractor.class, model);
        Client client = extractor.extractClientFrom(input);
        return client;
    }
    /*
    interface dataExtractor {
        @UserMessage("Extract information about a client from {{it}}")
        String extractInformationFrom(String text);
        // How to specify what field the data is???
    }

     */

}
