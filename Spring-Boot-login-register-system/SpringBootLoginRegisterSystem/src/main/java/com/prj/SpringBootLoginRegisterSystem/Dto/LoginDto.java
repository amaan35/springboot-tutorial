package com.prj.SpringBootLoginRegisterSystem.Dto;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
