package oop.lesson7.practice;

public class Practice {
    public static void main(String[] args) {
        Car zvorikinCar = new Car("ZvorikinCar");
        Car superCar = new Car("superCar", 400);
        superCar.overClocking();
        zvorikinCar.overClocking();

        Garage garage = new Garage();
        garage.setCar1(zvorikinCar);
        garage.setCar2(superCar);
        garage.getInfoAboutCars();
    }
}
