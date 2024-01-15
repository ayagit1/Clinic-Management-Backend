package com.sante.heart.model;

import jakarta.persistence.*;

@Entity
@Table(name = "patient_dim")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patientid")
    private Long patientid;

    @Column(name = "age")
    private double age;

    @Column(name = "sex")
    private double sex;

    public Long getPatientid() {
        return patientid;
    }

    public void setPatientid(Long patientid) {
        this.patientid = patientid;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSex() {
        return sex;
    }

    public void setSex(double sex) {
        this.sex = sex;
    }
}
