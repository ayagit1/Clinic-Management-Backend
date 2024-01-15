package com.sante.heart.controller;

import com.sante.heart.model.Diagnostic;
import com.sante.heart.service.DiagnosticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diagnostics")
public class DiagnosticController {

    @Autowired
    private DiagnosticService diagnosticService;

    @PostMapping
    public Diagnostic createDiagnostic(@RequestBody Diagnostic diagnostic) {
        return diagnosticService.createDiagnostic(diagnostic);
    }

    @GetMapping
    public List<Diagnostic> getDiagnostics() {
        return diagnosticService.getDiagnostics();
    }

    @GetMapping("/{diagnosisid}")
    public Diagnostic getDiagnosticById(@PathVariable("diagnosisid") long diagnosisid) {
        return diagnosticService.getDiagnosticById(diagnosisid);
    }

    @PutMapping("/{diagnosisid}")
    public Diagnostic updateDiagnostic(@RequestBody Diagnostic diagnostic, @PathVariable("diagnosisid") long diagnosisid) {
        return diagnosticService.updateDiagnostic(diagnostic, diagnosisid);
    }

    @DeleteMapping("/{diagnosisid}")
    public String deleteDiagnostic(@PathVariable("diagnosisid") long diagnosisid) {
        diagnosticService.deleteDiagnostic(diagnosisid);
        return "Diagnostic deleted successfully";
    }
}

