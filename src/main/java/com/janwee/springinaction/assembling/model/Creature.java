package com.janwee.springinaction.assembling.model;

//An interface of creature.
public interface Creature {
    String selfIdentify();

    static Creature newInstance(String kind){
        switch (kind){
            case "Dwarf": return new Dwarf();
            case "Elf": return new Elf();
            case "Hobbit":return new Hobbit();
            case "Man":return new Man();
        }
        return null;
    }
}
