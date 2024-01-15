package com.sante.heart.model;

import jakarta.persistence.*;

@Entity
@Table(name="symptom_dim")
public class Symptom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "symptomid")
    private Long symptomid;

    @Column(name = "cp")
    private double cp;

    @Column(name = "trestbps")
    private double trestbps;

    @Column(name = "chol")
    private double chol;

    @Column(name = "fbs")
    private double fbs;

    @Column(name = "restecg")
    private double restecg;

    @Column(name = "thalach")
    private double thalach;

    @Column(name = "exang")
    private double exang;

    @Column(name = "oldpeak")
    private double oldpeak;

    public Long getSymptomid() {
        return symptomid;
    }

    public void setSymptomid(Long symptomid) {
        this.symptomid = symptomid;
    }

    public double getCp() {
        return cp;
    }

    public void setCp(double cp) {
        this.cp = cp;
    }

    public double getTrestbps() {
        return trestbps;
    }

    public void setTrestbps(double trestbps) {
        this.trestbps = trestbps;
    }

    public double getChol() {
        return chol;
    }

    public void setChol(double chol) {
        this.chol = chol;
    }

    public double getFbs() {
        return fbs;
    }

    public void setFbs(double fbs) {
        this.fbs = fbs;
    }

    public double getRestecg() {
        return restecg;
    }

    public void setRestecg(double restecg) {
        this.restecg = restecg;
    }

    public double getThalach() {
        return thalach;
    }

    public void setThalach(double thalach) {
        this.thalach = thalach;
    }

    public double getExang() {
        return exang;
    }

    public void setExang(double exang) {
        this.exang = exang;
    }

    public double getOldpeak() {
        return oldpeak;
    }

    public void setOldpeak(double oldpeak) {
        this.oldpeak = oldpeak;
    }
}
