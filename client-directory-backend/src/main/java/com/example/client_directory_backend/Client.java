package com.example.client_directory_backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String address;

    public Client() {}

    public Client(String firstname, String lastname, String email, String phoneNumber, String address) {
        setFirstname(firstname);
        setLastname(lastname);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public Long getId() { return id; }
    private void setId(long id) { this.id = id; }

    public String getFirstname() { return firstname; }
    private void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    private void setLastname(String lastname) { this.lastname = lastname; }

    public String getEmail() { return email; }
    private void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    private void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
