package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="stud")


public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  .IDENTITY.IDENTITY)
    private int studeId;

    private String studName;

    private String studAddress;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date studDOB;

    private long studContactNumber;

    private long studUID;


}
