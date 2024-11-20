package oop.lesson7;

import oop.lesson7.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
//        Cat cat = new Cat("Black", 10, "Petr");
//        System.out.println(cat.color);
//        System.out.println(cat.weight);
//        System.out.println(cat.ownerName);
//
//        cat.color = "Red";
//
//        System.out.println(cat.color);
//        cat.destroySofa("петра");
//        String resultHunt = cat.hunt(false);
//        String resultHunt2 = cat.hunt(false, false);
//        cat.hunt("Утро1");
//        System.out.println();

//        cat.feed("Артем","Рыбу", "Корм");



//        Dog dog = new Dog("muhtar", -20, "Artem");
//
//        System.out.println(dog);
//        dog.setWeight(-1);
//        System.out.println(dog);
//        System.out.println(dog.getOwner());
//
//        Dog dog1 = new Dog();
//        System.out.println(dog1);
        Dog dog = new Dog("muhtar", -20, "Artem");
        Cat cat = new Cat("Black", 5, "Artem");
        Zoo zoo = new Zoo(null, dog);
        zoo.feed();

    }
}
