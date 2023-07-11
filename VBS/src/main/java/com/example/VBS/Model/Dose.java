package com.example.VBS.Model;

import com.example.VBS.Enum.DoseName;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date; // this include both date and time

@FieldDefaults(level= AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Dose {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // this will generate the id in table by itself ,so that i will be new for every entry
    int id;   // pk

    String uid; // this is the unique id that every product has , like we have barcodes
    @Enumerated(value = EnumType.STRING)
    DoseName doseName; // this will be enum
    Date vaccineTakenOn;

    @ManyToOne
    @JoinColumn // this puts the foregirn key in dose table , but default it uses PK of parent table
    Person person;
}
