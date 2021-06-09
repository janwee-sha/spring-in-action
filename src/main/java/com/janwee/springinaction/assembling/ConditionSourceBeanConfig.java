package com.janwee.springinaction.assembling;

import com.janwee.springinaction.assembling.model.ACondition;
import com.janwee.springinaction.assembling.model.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import static com.janwee.springinaction.assembling.model.Fruit.Strawberry;
import static com.janwee.springinaction.assembling.model.Size.Middle;
import static com.janwee.springinaction.assembling.model.Sugar.Quarter;

@Configuration
public class ConditionSourceBeanConfig {
    @Bean
    @Conditional(ACondition.class)
    public Source conditionalSource() {
        return new Source().withSize(Middle).withSugar(Quarter).withFruit(Strawberry);
    }
}
