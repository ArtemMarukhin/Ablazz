package oop.inharitance.lesson9.practice;

public abstract class Worker {

    public String sex;

    public String skill;

    public int salary;

    public Worker(String sex, String skill, int salary) {
        this.sex = sex;
        this.skill = skill;
        this.salary = salary;
    }

    public void drinkCoffee(){

    }

    public abstract void takeSalary(int salary);


}
