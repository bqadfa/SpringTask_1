package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Child {

    @Autowired
    private Middle middle;
    @Autowired
    @Qualifier(value = "Child")
    private Parent parent;

    public Child(Middle middle) {
        this.middle = middle;
    }

    public Parent getParentOfChild() {
        return parent;
    }

    public void setMiddle(Middle middle) {
        this.middle = middle;
    }

    public Middle getMiddle() {
        return middle;
    }

}