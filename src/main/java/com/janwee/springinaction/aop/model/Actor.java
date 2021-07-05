package com.janwee.springinaction.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Actor {
    public void act() {
        System.out.println("Actor:(acting).");
        double rand = Math.random();
        if (rand > 0.8) failedToAct();
    }

    private void failedToAct() {
        System.out.println("Actor:Sorry,I failed.");
        throw new RuntimeException("Action failed.");
    }
}
