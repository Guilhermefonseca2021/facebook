package com.facebook.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_users")
public class User {
    private static final long serialVersionUID = 1l;
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
    private String email;
    private String password;
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public UUID getId(UUID id) {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
