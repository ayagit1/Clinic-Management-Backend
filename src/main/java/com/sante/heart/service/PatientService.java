package com.sante.heart.service;

import com.sante.heart.model.Patient;

import java.util.List;

public interface PatientService {
    public Patient createPatient(Patient patient);

    public List<Patient> getPatients();

    public Patient getPatientById(long patientid);

    public void deletePatient(long patientid);

    public Patient updatePatient(Patient patient, long patientId);
}
