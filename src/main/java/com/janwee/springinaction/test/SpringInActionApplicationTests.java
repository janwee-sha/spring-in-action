package com.janwee.springinaction.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringInActionApplicationTests {
    @BeforeAll
    static void beforeAll() {
        System.out.println("<<< Starting SpringInActionApplicationTests.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished SpringInActionApplicationTests.");
    }
    @Test
    void contextLoads() {
        System.out.println("Testing context loads.");
    }

}
