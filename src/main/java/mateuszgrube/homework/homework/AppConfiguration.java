package mateuszgrube.homework.homework;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfiguration {
    @Bean
    @ConditionalOnProperty(name="my.custom.initBean", havingValue = "true")
    public ConditionalBean conditionalBean() {
        return new ConditionalBean();
    }
}
