package com.sante.heart.model;

import jakarta.persistence.*;

@Entity
@Table(name = "testresult_dim")
public class TestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "testid")
    private Long testid;

    @Column(name = "slope")
    private double slope;

    @Column(name = "ca")
    private double ca;

    @Column(name = "thal")
    private double thal;

    public Long getTestid() {
        return testid;
    }

    public void setTestid(Long testid) {
        this.testid = testid;
    }

    public double getSlope() {
        return slope;
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public double getCa() {
        return ca;
    }

    public void setCa(double ca) {
        this.ca = ca;
    }

    public double getThal() {
        return thal;
    }

    public void setThal(double thal) {
        this.thal = thal;
    }
}
