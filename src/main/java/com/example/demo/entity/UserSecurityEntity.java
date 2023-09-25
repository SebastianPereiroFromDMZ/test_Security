package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "securityUserEntity")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserSecurityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private ERoll roll = ERoll.USER_ROLE;
}
