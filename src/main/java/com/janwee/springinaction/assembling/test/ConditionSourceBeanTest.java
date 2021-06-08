package com.janwee.springinaction.assembling.test;

import com.janwee.springinaction.assembling.ConditionSourceBeanConfig;
import com.janwee.springinaction.model.Source;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static com.janwee.springinaction.model.Fruit.Strawberry;
import static com.janwee.springinaction.model.Size.Middle;
import static com.janwee.springinaction.model.Sugar.Quarter;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {ConditionSourceBeanConfig.class})
class ConditionSourceBeanTest {

    @Autowired
    @Qualifier("conditionalSource")
    private Source source;

    @BeforeAll
    static void beforeAll() {
        System.out.println("<<< Starting ConditionSourceBeanTest.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished ConditionSourceBeanTest.");
    }

    @Test
    void testConditionalSource() {
        System.out.println("Testing bean of conditional Source.");
        assertNotNull(source);
        assertEquals(new Source().withSize(Middle).withSugar(Quarter).withFruit(Strawberry), source);
    }
}
