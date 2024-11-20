package oop.inharitance.lesson9.practice1;

public class Runner {
    public static void main(String[] args) {
        Secretary secretary = new Secretary(false);
        Security security = new Security(true);

        security.getSalary();
        secretary.drinkCoffee();
        secretary.getSalary();

    }
}
