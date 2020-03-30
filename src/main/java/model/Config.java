package model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "model")
public class Config {


    @Bean
    @Qualifier("Middle")
    public Parent getMiddleParent() {
        return new Parent();
    }


    @Bean
    @Qualifier(value = "Child")
    public Parent getChildParent() {
        Parent parent = new Parent();
        parent.setName("Clint");
        return parent;
    }



}
