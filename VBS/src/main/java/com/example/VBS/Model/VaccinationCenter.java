package com.example.VBS.Model;

import com.example.VBS.Enum.CenterType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.sql.Time;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this will generate the id in table by itself ,so that i will be new for every entry
    int id;   // pk

    CenterType centerType;
    String address;
    // you can also add openaing and closing time here
}
