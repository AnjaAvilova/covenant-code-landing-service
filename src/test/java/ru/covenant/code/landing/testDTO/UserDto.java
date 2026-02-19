package ru.covenant.code.landing.testDTO;

import contraints.ValidEmail;
import jakarta.validation.constraints.NotBlank;


public class UserDto {

    @ValidEmail
    @NotBlank
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
