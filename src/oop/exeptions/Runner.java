package oop.exeptions;

import oop.lesson7.Cat;

public class Runner {
    public static void main(String[] args) {
        try {
            Car car = new Car(true);
            car.start();
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
