package com.spring.jpa.practice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="EMPLOYE")
public class Employe {
    @Id
    private int eid;

    private String ename;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "DEPTID", referencedColumnName = "DEPTID")
    private Department department;
}