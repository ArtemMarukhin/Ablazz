package oop.inharitance.lesson9.dogs;

public class Terier extends Dog {

    public Terier() {
        super(30);
    }

    @Override
    public void breath() {
        System.out.println("Терьер дишит");
    }

    @Override
    public void run() {
        System.out.println("Терьер бежит");
    }
}
