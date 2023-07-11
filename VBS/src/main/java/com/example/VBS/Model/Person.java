package com.example.VBS.Model;

import com.example.VBS.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this will generate the id in table by itself ,so that i will be new for every entry
    int id;   // pk
    String name;
    @Column(nullable = false,unique = true)
    String email;
    @Enumerated(EnumType.STRING) // i am telling DB that store this as a string
    Gender gender; // this will be a enum class
    boolean isDose1Taken;
    boolean isDose2Taken;
//    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL) // cascade does all the cRud operations
//    List<Dose> doses = new ArrayList<>();
}
