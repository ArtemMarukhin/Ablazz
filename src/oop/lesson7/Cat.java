package oop.lesson7;

import java.util.Arrays;

public class Cat {
    public String color;
    double weight;
    private String ownerName;
    {
        System.out.println("Кошка создалась");
    }

    public Cat(String colorName, double weightCat, String owner){
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroySofa(String sofaOwner){
        System.out.printf("Кот дерет диван %s\n", sofaOwner);
    }

    public String hunt(boolean isDay){
        if (isDay){
            return "Мышь";
        }
        return "Сова";
    }

    public String hunt (boolean isDay, boolean success){
        if(success){
            if (isDay){
                return "Мышь";
            }
            return "Сова";
        }
        return "Ничего";
    }

    public void feed(String giver, String... product){
        System.out.printf("Человек %s дает еду. Кот поел: %s\n" , giver, Arrays.toString(product));
    }


    public void hunt(String timesOfDay){
        if (timesOfDay.equals("Утро")){
            System.out.println("Мышь");
        } else {
            System.out.println("Комар");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
