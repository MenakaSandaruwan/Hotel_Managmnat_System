package com.phegondev.PhegonHotel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.ArrayList;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotBlank(message = "Email Not required")
    @Column
    private String email;
    private String name;
    private String phoneNumber;
    private  String password;
    private  String role;
    private  List<Booking> booking =new ArrayList<>();

}
