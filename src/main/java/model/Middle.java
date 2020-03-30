package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Middle {

    private Parent parent;

    public Middle(Parent parent) {
        this.parent = parent;
    }

    @Autowired
    public void setParent(Parent parent) {
        this.parent = parent;
    }


    public Parent getParent() {
        return parent;
    }
}
