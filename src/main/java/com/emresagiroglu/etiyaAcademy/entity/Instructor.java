package com.emresagiroglu.etiyaAcademy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;
    private String instructorInfo;
    private List<Course> courses;
}
