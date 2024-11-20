package oop.class_object;

public class Cat extends Object{
    private String catName;

    public Cat(String catname) {
        this.catName = catname;
    }

    @Override
    public String toString() {
        return catName;
    }
}
