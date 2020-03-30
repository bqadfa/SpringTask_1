package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Parent {

    private String name = "Shrek";


    public String getName() { return this.name; }

    public void setName(String name) {
        this.name = name;
    }
}
