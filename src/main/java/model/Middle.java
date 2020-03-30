package model;

public class Middle {

    private Parent parent;

    public Middle(Parent parent) {
        this.parent = parent;
    }


    public void setParent(Parent parent) {
        this.parent = parent;
    }


    public Parent getParent() {
        return parent;
    }
}