package oop.lesson8.practice;

public class Runner {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        Restaurant restaurant2 = new Restaurant();

        restaurant1.cookHotDog();
        restaurant2.addProducts();
        restaurant2.cookHotDog();
        restaurant1.cookHotDog();
    }
}
