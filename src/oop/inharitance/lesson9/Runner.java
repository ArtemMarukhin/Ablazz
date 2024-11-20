package oop.inharitance.lesson9;

import oop.inharitance.lesson9.dogs.Poodle;
import oop.inharitance.lesson9.dogs.Shephard;
import oop.inharitance.lesson9.dogs.Terier;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Информация о пуделе");
        // Пудель
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        poodle.breath();
        System.out.println(poodle.countTeeth);


        System.out.println("Информация об овчарке");
        //Овчарка
        Shephard shephard = new Shephard();
        shephard.bark();
        shephard.run();
        shephard.breath();
        shephard.beAngry();
        System.out.println(shephard.countTeeth);

        System.out.println("Информация о терьере");
        //Терьер
        Terier terier = new Terier();
        System.out.println(terier.countTeeth);
    }
}
