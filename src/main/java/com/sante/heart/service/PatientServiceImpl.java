package com.sante.heart.service;

import com.sante.heart.model.Patient;
import com.sante.heart.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getPatients() {
        return (List<Patient>) patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(long patientid) {
        return patientRepository.findById(patientid).orElse(null);
    }

    @Override
    public void deletePatient(long patientid) {
        patientRepository.deleteById(patientid);
    }

    @Override
    public Patient updatePatient(Patient patient, long patientid) {
        Patient existingPatient = patientRepository.findById(patientid).orElse(null);
        if (existingPatient != null) {
            existingPatient.setAge(patient.getAge());
            existingPatient.setSex(patient.getSex());
            // Set other properties to be updated

            return patientRepository.save(existingPatient);
        }
        return null;
    }
}
