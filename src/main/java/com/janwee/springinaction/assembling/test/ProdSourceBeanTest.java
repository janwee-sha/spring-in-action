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

import static com.janwee.springinaction.model.Fruit.Orange;
import static com.janwee.springinaction.model.Size.Big;
import static com.janwee.springinaction.model.Size.Small;
import static com.janwee.springinaction.model.Sugar.Full;
import static com.janwee.springinaction.model.Sugar.None;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("prod")
@ContextConfiguration(classes = {SourceBeanConfig.class})
class ProdSourceBeanTest {
    @Resource(name = "prodSource")
    private Source source;

    @BeforeAll
    static void beforeAll() {
        System.out.println("<<< Starting ProdSourceBeanTest.");
    }

    @AfterAll
    static void afterAll() {
        System.out.println(">>> Finished ProdSourceBeanTest.");
    }

    @Test
    void testProdSource() {
        System.out.println("Testing bean of Source while prod profile being activated.");
        assertNotNull(source);
        assertEquals(new Source().withSize(Big).withSugar(Full).withFruit(Orange), source);
        assertNotEquals(new Source().withFruit(Orange).withSize(Small).withSugar(None), source);
    }
}
