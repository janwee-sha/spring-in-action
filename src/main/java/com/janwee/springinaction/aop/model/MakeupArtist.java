package com.janwee.springinaction.aop.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MakeupArtist {
    @Pointcut("execution(* com.janwee.springinaction.aop.model.Director.cut(..))")
    public void whenActionCut() {
    }

    @Pointcut("execution(* com.janwee.springinaction.aop.model.Director.action(..))")
    public void whenActionStart() {
    }

    @Pointcut("execution(* com.janwee.springinaction.aop.model.Director.finished(..))")
    public void whenActionFinished() {
    }

    @Before("whenActionStart()")
    public void makeUp() {
        System.out.println("Makeup artist:(made up).");
    }

    @After("whenActionFinished()")
    public void removeMakeUp() {
        System.out.println("Makeup artist:(removed the makeup).");
    }

    @After("whenActionCut()")
    public void fixMakeup() {
        System.out.println("Makeup artist:(fixed the makeup).");
    }
}
