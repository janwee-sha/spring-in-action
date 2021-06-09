package com.janwee.springinaction.assembling.model;

import org.springframework.stereotype.Component;

@Component
public class Hobbit implements Creature {
    public String selfIdentify() {
        return "I am a Hobbit,master.";
    }
}
