package oop.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Andrey";

    {
        System.out.println("Собака создалась");
    }

    public Dog() {
    }

    public void feed(String giver, String... product){
        System.out.printf("Человек %s дает еду. Пес поел: %s\n" , giver, Arrays.toString(product));
    }

    public Dog(String name, int weight, String owner) {
        if(weight < 1){
            this.weight = 5;
        } else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void setWeight(int weight) {
        if(weight < 1){
            this.weight = 5;
        } else {
            this.weight = weight;
        }
    }

    public String getOwner(){
        return "Mr." + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
