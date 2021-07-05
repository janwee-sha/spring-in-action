package com.janwee.springinaction.aop.test;

import com.janwee.springinaction.aop.model.Actor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActingTest {
    @Autowired
    private Actor actor;

    @BeforeAll
    static void beforeAll() {
        System.out.println(">>> Starting ActingTest");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("<<< Finished ActingTest.");
    }

    @Test
    void testAct() {
        try {
            actor.act();
        } catch (Exception e) {
            //do nothing
        }
    }
}
