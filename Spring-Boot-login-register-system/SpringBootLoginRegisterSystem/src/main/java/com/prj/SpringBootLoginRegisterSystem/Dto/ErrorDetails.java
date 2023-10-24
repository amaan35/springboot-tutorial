package com.prj.SpringBootLoginRegisterSystem.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {

    private Date date;
    private String errorMessage;
    private String errorDetail;
}
