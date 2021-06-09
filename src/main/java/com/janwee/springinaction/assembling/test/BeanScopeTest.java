package com.janwee.springinaction.assembling.test;

import com.janwee.springinaction.assembling.model.Computer;
import com.janwee.springinaction.assembling.model.Phone;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeanScopeTest {
    @Autowired
    private Computer computer1;

    @Autowired
    private Computer computer2;

    @Autowired
    private Phone phone1;

    @Autowired
    private Phone phone2;

    @BeforeAll
    static void beforeAll() {
        System.out.println("<<< Starting BeanScopeTest.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished BeanScopeTest.");
    }

    @Test
    void testBeanScope(){
        System.out.println("Testing scope of beans.");

        assertEquals(computer1,computer2);
        assertNotEquals(phone1,phone2);
    }
}
