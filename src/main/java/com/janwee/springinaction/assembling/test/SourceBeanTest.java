package com.janwee.springinaction.assembling.test;

import com.janwee.springinaction.assembling.SourceBeanConfig;
import com.janwee.springinaction.assembling.model.Source;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

import static com.janwee.springinaction.assembling.model.Fruit.Orange;
import static com.janwee.springinaction.assembling.model.Fruit.Strawberry;
import static com.janwee.springinaction.assembling.model.Size.Big;
import static com.janwee.springinaction.assembling.model.Size.Small;
import static com.janwee.springinaction.assembling.model.Sugar.Half;
import static com.janwee.springinaction.assembling.model.Sugar.None;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {SourceBeanConfig.class})
class SourceBeanTest {
    @Resource
    private Source source1;

    @BeforeAll
    static void beforeAll() {
        System.out.println("<<< Starting SourceBeanTest.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished SourceBeanTest.");
    }
    @Test
    void testSource() {
        System.out.println("Testing bean of Source.");
        assertNotNull(source1);
        assertEquals(new Source().withSugar(Half).withFruit(Strawberry).withSize(Big), source1);
        assertNotEquals(new Source().withFruit(Orange).withSize(Small).withSugar(None), source1);
    }
}
