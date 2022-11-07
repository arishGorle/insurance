package com.insurance.profilesservice.model;

import com.sun.istack.NotNull;
import lombok.*;
//import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name = "User_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String firstName;
    private  String lastName;
//    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private  String DOB;
    private String annualIncome;
//    private  String gender;
//    @NotNull(message="licenceNumber  can not be left unfilled")
//    private String licenceNumber;
}
