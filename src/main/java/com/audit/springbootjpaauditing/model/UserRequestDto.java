package com.audit.springbootjpaauditing.model;

import jakarta.validation.constraints.Email;

public class UserRequestDto {

    String fullName;

    int age;

    @Email
    String email;

    public UserRequestDto() {
    }

    public UserRequestDto(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
