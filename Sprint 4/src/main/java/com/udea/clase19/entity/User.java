package com.udea.clase19.entity;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    @Column(unique = true)
    private String authOId;
    @Column
    private String rol; // Nuevo atributo para el rol

    public User() {
    }

    public User(String email, String image, String authOId, String rol) {
        this.email = email;
        this.authOId = authOId;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthOId() {
        return authOId;
    }

    public void setAuthOId(String authOId) {
        this.authOId = authOId;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setAuth0UserId(String auth0UserId) {
    }

}
