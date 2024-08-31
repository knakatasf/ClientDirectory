package com.example.client_directory_backend;

import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class ClientDirectoryBackendApplication {

	public static void main(String[] args) {

		String apiKey = "demo";
		OpenAiChatModel model = OpenAiChatModel.withApiKey(apiKey);

		String answer = model.generate("What date is today?");
		System.out.println(answer);
		
		SpringApplication.run(ClientDirectoryBackendApplication.class, args);

		try {
			Connection conn = DriverManager.getConnection(System.getenv("DB_URL"),
					System.getenv("DB_USERNAME"),
					System.getenv("DB_PASSWORD"));

			System.out.println("Connected successfully!");
			conn.close();
		} catch (SQLException e) {
			System.out.println("SQL Exception occurred.");
		}
	}

}
