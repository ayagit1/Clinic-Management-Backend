package com.sante.heart.service;

import com.sante.heart.model.TestResult;
import com.sante.heart.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
@Autowired
private TestRepository testRepository;

    @Override
    public TestResult createTestResult(TestResult testResult) {
        return testRepository.save(testResult);
    }

    @Override
    public List<TestResult> getTestResult() {
        return (List<TestResult>) testRepository.findAll();
    }

    @Override
    public TestResult getTestResultById(long testid) {
        return testRepository.findById(testid).orElse(null);
    }

    @Override
    public void deleteTestResult(long testid) {
        testRepository.deleteById(testid);
    }

    @Override
    public TestResult updateTestResult(TestResult testResult, long testid) {
        TestResult existingTestResult = testRepository.findById(testid).orElse(null);
        if (existingTestResult != null) {
            existingTestResult.setSlope(testResult.getSlope());
            existingTestResult.setCa(testResult.getCa());
            existingTestResult.setThal(testResult.getThal());
            return testRepository.save(existingTestResult);
        }
        return null;
    }
}


