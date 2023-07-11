package com.example.VBS.Model;

import com.example.VBS.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this will generate the id in table by itself ,so that i will be new for every entry
    int id;   // pk
    String name;
    @Column(nullable = false,unique = true)
    String email;
    @Enumerated(EnumType.STRING) // i am telling DB that store this as a string
    Gender gender; // this will be a enum class
}
