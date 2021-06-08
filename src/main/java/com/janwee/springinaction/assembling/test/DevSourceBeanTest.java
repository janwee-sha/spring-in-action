package com.janwee.springinaction.assembling.test;

import com.janwee.springinaction.assembling.SourceBeanConfig;
import com.janwee.springinaction.model.Source;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;

import static com.janwee.springinaction.model.Fruit.Apple;
import static com.janwee.springinaction.model.Fruit.Orange;
import static com.janwee.springinaction.model.Size.Small;
import static com.janwee.springinaction.model.Sugar.None;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("dev")
@ContextConfiguration(classes = {SourceBeanConfig.class})
class DevSourceBeanTest {
    @Resource(name = "devSource")
    private Source source;

    @BeforeAll
    static void beforeAll() {
        System.out.println("<<< Starting DevSourceBeanTest.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished DevSourceBeanTest.");
    }

    @Test
    void testDevSource() {
        System.out.println("Testing bean of Source while dev profile being activated.");
        assertNotNull(source);
        assertEquals(new Source().withSugar(None).withFruit(Apple).withSize(Small), source);
        assertNotEquals(new Source().withFruit(Orange).withSize(Small).withSugar(None), source);
    }
}
