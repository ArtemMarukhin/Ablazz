package oop.anonymous_classes;

public class Runner {
    public static void main(String[] args) {
        Alive alive = new Alive() {
            @Override
            public void eat() {
                System.out.println("Dog eat");
            }

            @Override
            public void breath() {
                System.out.println("Dog breath");
            }
        };
        alive.breath();
        alive.eat();

        Animal cat = new Animal() {
            @Override
            public void eat() {
                System.out.println("Cat eat");
            }
        };

        cat.eat();


    }
}
