package com.amit.leetcode.annotation;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExecutionTimeAdvice {

    @Around("@annotation(com.amit.leetcode.annotation.ExecutionTime)")
    public Object executionTime(ProceedingJoinPoint point) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object object = point.proceed();
        long endTime = System.currentTimeMillis();
        log.info("Class Name: {}. Method Name: {}. Time taken for Execution is : {} ms",
                point.getSignature().getDeclaringTypeName(), point.getSignature().getName(), endTime - startTime);
        return object;
    }
}