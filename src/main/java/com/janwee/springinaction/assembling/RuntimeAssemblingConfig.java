package com.janwee.springinaction.assembling;

import com.janwee.springinaction.model.Creature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuntimeAssemblingConfig {
    @Value("${creature.primary-bean-type}")
    private String primaryBeanType;

    @Bean
    public Creature runtimeCreature(){
        return Creature.newInstance(primaryBeanType);
    }
}
