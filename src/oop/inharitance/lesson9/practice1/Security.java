package oop.inharitance.lesson9.practice1;

import oop.inharitance.lesson9.practice.Worker;

public class Security extends Human {
    public Security(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Охранник получил 15000");
    }
}
