package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Child {


    private Middle middle;

    public Child(Middle middle) {
        this.middle = middle;
    }

    @Autowired
    public void setMiddle(Middle middle) {
        this.middle = middle;
    }

    public Middle getMiddle() {
        return middle;
    }

}
