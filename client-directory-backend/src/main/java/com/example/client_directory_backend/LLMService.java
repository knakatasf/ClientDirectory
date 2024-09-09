package com.example.client_directory_backend;


import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.input.structured.StructuredPrompt;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.output.structured.Description;
import dev.langchain4j.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class LLMService {

    interface ClientExtractor {
        @UserMessage("Extract information about a client from {{it}}")
        Client extractClientFrom(String text);
    }

    public static void main(String[] args) {
        String input = "Koichi Nakata\n" +
                "Sat, Aug 24, 8:15PM\n" +
                "to me\n" +
                "\n" +
                "Dear Attorney Kudo,\n" +
                "\n" +
                "I would like to retain you for the green card application. Here is my address:\n" +
                "\n" +
                "\n" +
                "2030 Fell Street\n" +
                "San Francisco, CA 94117\n" +
                "\n" +
                "737-287-4451\n" +
                "\n" +
                "Please send me a retainer agreement to sign.\n" +
                "\n" +
                "Thank you,\n" +
                "Koichi\n";
        ChatLanguageModel model = OpenAiChatModel.withApiKey("sk-2ZpgruvdxExLmzsfvM6vlg0xJCMqsH9J6ISkwJRF9LT3BlbkFJZyvpMm8ObSDzi-apfXhXkTGdiGRSzCC2GMix3QrdAA");
        ClientExtractor extractor = AiServices.create(ClientExtractor.class, model);
        Client client = extractor.extractClientFrom(input);

        System.out.println(client);
    }

}
