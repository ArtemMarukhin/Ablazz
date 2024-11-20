package oop.inharitance.lesson9.practice.worker;

import oop.inharitance.lesson9.practice.Worker;

public class Accountant extends Worker {
    public Accountant(String sex) {
        super(sex, "умение считать налоги", 50000);
    }

    @Override
    public void drinkCoffee() {
        System.out.println("Пьет кофе");
    }

    @Override
    public void takeSalary(int salary) {
        System.out.println("Получает зарплату в размере " + salary);
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "sex='" + sex + '\'' +
                ", skill='" + skill + '\'' +
                ", salary=" + salary +
                '}';
    }
}
