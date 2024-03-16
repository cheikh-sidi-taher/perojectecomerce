package com.ecomerce.projectecome.dto;

import lombok.Data;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String address;
    private Integer phoneNumber;
    private String password;

    
}