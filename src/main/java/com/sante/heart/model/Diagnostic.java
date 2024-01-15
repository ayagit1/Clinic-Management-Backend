package com.sante.heart.model;


import jakarta.persistence.*;

@Entity
@Table(name = "diagnosis_dim")

public class Diagnostic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diagnosisid")
    private Long diagnosisid;

    @Column(name = "num")
    private double num;

    public Long getDiagnosisid() {
        return diagnosisid;
    }

    public void setDiagnosisid(Long diagnosisid) {
        this.diagnosisid = diagnosisid;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}