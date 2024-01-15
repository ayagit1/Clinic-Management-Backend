package com.sante.heart.controller;

import com.sante.heart.model.TestResult;
import com.sante.heart.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testresults")
public class TestResultController {

    @Autowired
    private TestService testService;

    @PostMapping
    public TestResult createTestResult(@RequestBody TestResult testResult) {
        return testService.createTestResult(testResult);
    }

    @GetMapping
    public List<TestResult> getTestResults() {
        return testService.getTestResult();
    }

    @GetMapping("/{testid}")
    public TestResult getTestResultById(@PathVariable("testid") long testid) {
        return testService.getTestResultById(testid);
    }

    @PutMapping("/{testid}")
    public TestResult updateTestResult(@RequestBody TestResult testResult, @PathVariable("testid") long testid) {
        return testService.updateTestResult(testResult, testid);
    }

    @DeleteMapping("/{testid}")
    public String deleteTestResult(@PathVariable("testid") long testid) {
        testService.deleteTestResult(testid);
        return "Test result deleted successfully";
    }
}
