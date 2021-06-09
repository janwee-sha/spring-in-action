package com.janwee.springinaction.assembling.test;

import com.janwee.springinaction.assembling.RuntimeAssemblingConfig;
import com.janwee.springinaction.assembling.model.Creature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {RuntimeAssemblingConfig.class})
class RuntimeAssemblingTest {
    @Autowired
    @Qualifier("runtimeCreature")
    private Creature creature;

    @Test
    void testRuntimeCreature(){
        assertNotNull(creature);
        assertEquals("I am a Dwarf,master.",creature.selfIdentify());
    }
}
