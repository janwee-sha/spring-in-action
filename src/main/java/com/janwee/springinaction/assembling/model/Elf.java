package com.janwee.springinaction.assembling.model;

import org.springframework.stereotype.Component;

@Component
public class Elf implements Creature {
    public String selfIdentify() {
        return "I am a Elf,master.";
    }
}
