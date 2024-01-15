package com.sante.heart.service;

import com.sante.heart.model.TestResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {
    public TestResult createTestResult(TestResult testResult);

    //read
    public List<TestResult> getTestResult();

    //read by id

    public TestResult getTestResultById(long testid);

    //delete
    public void deleteTestResult(long testid);

    //update
    public TestResult updateTestResult(TestResult testResult, long testid);
}
