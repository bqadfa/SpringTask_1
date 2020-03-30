package model;

import org.springframework.stereotype.Component;

@Component
public class Parent {

    private String name = "Shrek";

    public String getName() { return this.name; }

    public void setName(String name) {
        this.name = name;
    }
}
