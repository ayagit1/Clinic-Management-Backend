package com.sante.heart.controller;


import com.sante.heart.model.Patient;
import com.sante.heart.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return patientService.createPatient(patient);
    }

    @GetMapping
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }

    @GetMapping("/{patientid}")
    public Patient getPatientById(@PathVariable("patientid") long patientid) {
        return patientService.getPatientById(patientid);
    }

    @PutMapping("/{patientid}")
    public Patient updatePatient(@RequestBody Patient patient, @PathVariable("patientid") long patientid) {
        return patientService.updatePatient(patient, patientid);
    }

    @DeleteMapping("/{patientid}")
    public String deletePatient(@PathVariable("patientid") long patientid) {
        patientService.deletePatient(patientid);
        return "Patient deleted successfully";
    }
}
