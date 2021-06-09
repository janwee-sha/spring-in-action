package com.janwee.springinaction.assembling.test;

import com.janwee.springinaction.assembling.model.Creature;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class CreatureBeanTest {
    @Autowired
    private Creature creature1;

    @Autowired
    @Qualifier("elf")
    private Creature creature2;

    @BeforeAll
    static void beforeAll() {
        System.out.println("<<< Starting CreatureBeanTest.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished CreatureBeanTest.");
    }

    @Test
    void testPrimaryCreatureBean() {
        System.out.println("Testing primary bean of Creature.");

        assertNotNull(creature1);
        assertEquals("I am a Man,master.", creature1.selfIdentify());
    }

    @Test
    void testElfBean() {
        System.out.println("Testing bean of Elf.");

        assertNotNull(creature2);
        assertEquals("I am a Elf,master.", creature2.selfIdentify());
    }
}
