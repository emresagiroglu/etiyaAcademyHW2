package com.emresagiroglu.etiyaAcademy.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private int memberId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private Card creditCard;
    private List<Transaction> transactions;
}
