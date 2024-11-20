package oop.inharitance.lesson9.practice1;

public class Secretary extends OfficeWorker{
    public Secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Серетарь получил зарплату 30000");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("Серетарь пьет кофе");
    }

}
