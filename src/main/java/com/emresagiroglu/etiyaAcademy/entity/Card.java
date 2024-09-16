package com.emresagiroglu.etiyaAcademy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String nameOnCard;
    private String cardNumber;
    private String expDate;
    private String postalCode;
    private String country;
    private int cvc;
}
