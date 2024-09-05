package com.example.client_directory_backend;

public class ClientRequest {
    private String action;
    private String input;

    public ClientRequest() {}

    public ClientRequest(String action, String input) {
        setAction(action);
        setInput(input);
    }

    public String getAction() { return action; }
    private void setAction(String action) { this.action = action; }

    public String getInput() { return input; }
    private void setInput(String input) { this.input = input; }
}
