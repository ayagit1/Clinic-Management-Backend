package com.sante.heart.service;

import com.sante.heart.model.Diagnostic;

import java.util.List;

public interface DiagnosticService {
    Diagnostic createDiagnostic(Diagnostic diagnostic);

    List<Diagnostic> getDiagnostics();

    Diagnostic getDiagnosticById(long diagnosisid);

    void deleteDiagnostic(long diagnosisid);

    Diagnostic updateDiagnostic(Diagnostic diagnosis, long diagnosisid);
}
