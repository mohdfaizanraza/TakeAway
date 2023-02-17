package com.elevate.app.takeaway.model;

import javax.validation.constraints.NotEmpty;

public class SignUpModel {
    @NotEmpty(message = "User name cannot be empty")
    private String name;

    @NotEmpty(message = "User password cannot be empty")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {this.password = password;}
}
