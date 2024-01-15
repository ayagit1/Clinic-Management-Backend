package com.sante.heart.service;

import com.sante.heart.model.Diagnostic;
import com.sante.heart.repository.DiagnosticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnosticServiceImpl implements DiagnosticService {

    @Autowired
    private DiagnosticRepository diagnosticRepository;

    @Override
    public Diagnostic createDiagnostic(Diagnostic diagnostic) {
        return diagnosticRepository.save(diagnostic);
    }

    @Override
    public List<Diagnostic> getDiagnostics() {
        return (List<Diagnostic>) diagnosticRepository.findAll();
    }

    @Override
    public Diagnostic getDiagnosticById(long diagnosisid) {
        return diagnosticRepository.findById(diagnosisid).orElse(null);
    }

    @Override
    public void deleteDiagnostic(long diagnosisid) {
        diagnosticRepository.deleteById(diagnosisid);
    }

    @Override
    public Diagnostic updateDiagnostic(Diagnostic diagnostic, long diagnosisid) {
        Diagnostic existingDiagnostic = diagnosticRepository.findById(diagnosisid).orElse(null);
        if (existingDiagnostic != null) {
            // Update the properties of the existing diagnostic
            existingDiagnostic.setNum(diagnostic.getNum());
            // Set other properties to be updated

            return diagnosticRepository.save(existingDiagnostic);
        }
        return null;
    }
}
