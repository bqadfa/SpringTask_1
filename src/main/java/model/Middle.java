package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Middle {

    @Autowired
    @Qualifier(value = "Middle")
    private Parent parent;

    public Middle(Parent parent) {
        this.parent = parent;
    }


    public void setParent(Parent parent) {
        this.parent = parent;
    }


    public Parent getParentOfMiddle() {
        return parent;
    }
}
