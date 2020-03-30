package model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Child getChild() {
        Child child = new Child();
        child.setMiddle(getMiddle());
        return child;
    }

    @Bean
    Middle getMiddle(){
        Middle middle = new Middle();
        middle.setParent(getParent());
        return middle;
    }

    @Bean
    Parent getParent() {
        return new Parent();
    }
}
