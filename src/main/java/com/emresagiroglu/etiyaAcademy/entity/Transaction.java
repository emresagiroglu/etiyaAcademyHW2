package com.emresagiroglu.etiyaAcademy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private int transactionId;
    private int memberId;
    private int courseId;
    private double price;
}
