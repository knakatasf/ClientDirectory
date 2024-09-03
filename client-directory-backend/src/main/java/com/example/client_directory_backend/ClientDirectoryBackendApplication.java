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

		String answer = model.generate("Can you extract a new client name, email, phone number, and address from this?" +
				"Dear Attorney Kudo,\n" +
				"\n" +
				"I would like to retain you for the green card application. Here is my address:\n" +
				"\n" +
				"Koichi Nakata\n" +
				"\n" +
				"2030 Fell Street\n" +
				"San Francisco, CA 94117\n" +
				"\n" +
				"737-287-4451");

		System.out.println(answer);

		//SpringApplication.run(ClientDirectoryBackendApplication.class, args);

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
