package com.audit.springbootjpaauditing.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "users")
@SuperBuilder
public class User extends UserAudit{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String fullName;

    int age;

    @Email
    String email;

    public User() {
    }

    public User(int id, String fullName,int age,String email) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public User(String fullName,int age,String email) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
