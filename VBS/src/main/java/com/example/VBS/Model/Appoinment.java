package com.example.VBS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Appoinment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String appoinmentId;
    Date appoinmentDate;
    int doseNo;
}
