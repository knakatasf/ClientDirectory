package com.example.client_directory_backend;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

//@Service
public class LLMService {
    ChatLanguageModel cl;
    private static final String PROMPT =
                    "Please extract the following information from the text provided\n:" +
                    "1. Name\n2. Email address\n3. Phone number \n4. Address\n\n" +
                    "If any of these details are not present in the text, use \"n/a\" for those fields." +
                    "Provide the information in the following format, separated by semi-colons:" +
                    "Name;Email address;Phone number;Address\n\n" +
                    "Here is the text to process:";

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

        ExtractedData data = new ExtractedData();
        ChatLanguageModel cl = OpenAiChatModel.withApiKey("demo");
        String finalPrompt = PROMPT + input;
        String answer = cl.generate(finalPrompt);

        System.out.println(answer);
    }

    public ExtractedData processInput(String input) {



        return null;
    }
}
