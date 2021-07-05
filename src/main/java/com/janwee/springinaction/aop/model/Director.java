package com.janwee.springinaction.aop.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Aspect
@Component
public class Director {

    @Pointcut("execution(* com.janwee.springinaction.aop.model.Actor.act(..))")
    public void whenActorActing() {
    }

    public void action() {
        System.out.println("Director:Action!");
    }

    public void cut() {
        System.out.println("Director:Cut!");
    }

    public void finished() {
        System.out.println("Director:All right,works done.");
    }


    @Around("whenActorActing()")
    public void directActing(ProceedingJoinPoint jp) {
        try {
            action();
            jp.proceed();
            finished();
        } catch (Throwable throwable) {
            cut();
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                directActing(jp);
            }
        }
    }
}
