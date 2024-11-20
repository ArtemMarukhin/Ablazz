package oop.exeptions;

public class Car {
    private boolean isBroken;

    public Car(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void start() throws CarIsBrokenExeption {
        if (isBroken){
            throw new CarIsBrokenExeption("Машина не работает!");
        }
        System.out.println("Машина успешно стартовала!");
    }
}
