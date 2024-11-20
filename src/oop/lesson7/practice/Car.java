package oop.lesson7.practice;

public class Car {
    private String name;
    private int maxSpeed = 220;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void overClocking(){
        double overClockingValue = 110d/(this.maxSpeed/20d);
        System.out.printf("Разгон: %s\n", overClockingValue);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }
}
