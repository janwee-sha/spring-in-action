package com.janwee.springinaction.assembling.model;

import org.springframework.stereotype.Component;

@Component
public class Dwarf implements Creature {
    public String selfIdentify() {
        return "I am a Dwarf,master.";
    }
}