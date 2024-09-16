package com.emresagiroglu.etiyaAcademy.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    private int id;
    private String courseName;
    private String courseDesc;
    private int instructorId;
    private double coursePrice;
}
