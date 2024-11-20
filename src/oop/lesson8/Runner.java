package oop.lesson8;

import oop.lesson7.Cat;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Car audi = new Car("BMW");
        Car bmw = new Car("Audi");
//        Car kia = new Car("KIA");
//        System.out.println("количество машин: " + Car.countCars);
//
//        Car.printBrands();
//        System.out.println(Car.BMW_INFO);
//
//        Car.bmw_info = "Иная информация";
//        System.out.println(Car.bmw_info);
        Car.BRAND_DESCRIPTIONS[0] = "ллл";
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));
    }
}
