package ma.octo.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {
    @Before("execution(* ma.octo.demo.beans.*Bean.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Calling Method " + joinPoint.getSignature().getName() + " with Args " + Arrays.toString(joinPoint.getArgs()));
    }

    @After("execution(* ma.octo.demo.beans.*Bean.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Method " + joinPoint.getSignature().getName() + " Called with args " + Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut ="execution(* ma.octo.demo.beans.*Bean.*(..))",returning="result")
    public void logAfterReturn(JoinPoint joinPoint,Object result) {
        System.out.println("Method " + joinPoint.getSignature().getName() + " Called with args " + Arrays.toString(joinPoint.getArgs())+" and returned "+result);
    }

    @AfterThrowing(pointcut = "execution(* ma.octo.demo.beans.*Bean.*(..))", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("Method " + joinPoint.getSignature().getName() + " has thrown exception " + e);
    }
}
