package oop.inharitance.lesson9.practice;

import oop.inharitance.lesson9.practice.worker.Accountant;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Информация об охраннике");


        System.out.println();

        System.out.println("Информация о бухгалтере");
        Accountant accountant = new Accountant("Женский");
        System.out.println(accountant.toString());
        accountant.drinkCoffee();
        accountant.takeSalary(50000);

        System.out.println();

        System.out.println("Информация об офисном работнике");


        System.out.println();

        System.out.println("Информация о секретаре");


        System.out.println();
    }
}
