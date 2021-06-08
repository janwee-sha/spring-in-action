package com.janwee.springinaction.assembling;

import com.janwee.springinaction.model.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static com.janwee.springinaction.model.Fruit.*;
import static com.janwee.springinaction.model.Size.Big;
import static com.janwee.springinaction.model.Size.Small;
import static com.janwee.springinaction.model.Sugar.*;

@Configuration
public class SourceBeanConfig {
    //a source bean for all environment.
    @Bean
    public Source source() {
        return new Source().withFruit(Strawberry).withSugar(Half).withSize(Big);
    }

    //a source bean for dev environment.
    @Profile("dev")
    @Bean
    public Source devSource() {
        return new Source().withSize(Small).withSugar(None).withFruit(Apple);
    }

    //a source bean for prod environment.
    @Profile("prod")
    @Bean
    public Source prodSource() {
        return new Source().withSize(Big).withSugar(Full).withFruit(Orange);
    }
}
