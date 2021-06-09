package com.janwee.springinaction.assembling.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Man implements Creature {
    public String selfIdentify() {
        return "I am a Man,master.";
    }
}
