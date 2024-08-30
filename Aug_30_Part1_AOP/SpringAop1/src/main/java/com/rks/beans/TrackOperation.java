package com.rks.beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class TrackOperation
{
    @Pointcut("execution(* com.rks.beans.Operation.*(..))")
    public void k() //poincut name
    {

    }
    @Before("k()")//applying poincut on before advice
    public void myadvice(JoinPoint jp)
    {
        System.out.println("Addition concern");
    }
}