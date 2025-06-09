package com.example.employeeManagement.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Before("execution(* com.example.employeeManagement.serviceImpl.CandidateServiceImpl.saveCandidate(...))")
    public void test() {
        System.out.println("Testing Aspect");
    }
}
