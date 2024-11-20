package oop.inharitance.lesson9.dogs;

public final class Shephard extends Dog {

    public Shephard() {
        super(28);
    }

    @Override
    public void run() {
        System.out.println("Собака бежит быстро");
    }

    @Override
    public void breath() {
        System.out.println("Овчарка дышит");
    }

    @Override
    public void bark() {
        System.out.println("Овчарка громко лает");
    }

    @Override
    public void beAngry() {
        System.out.println(super.countLegs);
        System.out.println("Овчарка увидела чужого человека");
        super.beAngry();
        System.out.println("Овчарка успокоилась");
    }
}
