package com.example.client_directory_backend;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
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
        setLasename(lastname);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public Long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstname() { return firstname; }
    public void setFirstname(String firstname) { this.firstname = firstname; }

    public String getLastname() { return lastname; }
    public void setLasename(String lastname) { this.lastname = lastname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Client information:\n" +
                "Name:\t" + getLastname() + ", " + getFirstname() +
                "Email:\t" + getEmail() +
                "Phone:\t" + getPhoneNumber() +
                "Address:\n" + getAddress() + System.lineSeparator());
        return res.toString();
    }
}
