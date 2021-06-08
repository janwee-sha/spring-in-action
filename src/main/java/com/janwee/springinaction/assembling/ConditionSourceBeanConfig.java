package com.janwee.springinaction.assembling;

import com.janwee.springinaction.model.ACondition;
import com.janwee.springinaction.model.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import static com.janwee.springinaction.model.Fruit.Strawberry;
import static com.janwee.springinaction.model.Size.Middle;
import static com.janwee.springinaction.model.Sugar.Quarter;

@Configuration
public class ConditionSourceBeanConfig {
    @Bean
    @Conditional(ACondition.class)
    public Source conditionalSource() {
        return new Source().withSize(Middle).withSugar(Quarter).withFruit(Strawberry);
    }
}
