package br.com.fiap.api_sphere.user;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name ="users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    String name;
    String bio;
    String email;
    String password;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
