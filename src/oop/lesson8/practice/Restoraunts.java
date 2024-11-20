package oop.lesson8.practice;

public class Restoraunts {
    private static int sosiski;
    private static int bread;

    public void dish(int sosiski, int bread){
        if (sosiski < 1){
            System.out.println("нет ингридиентов");
        }
        if(bread < 2){
            System.out.println("нет ингридиентов");
        }
        this.bread = bread-2;
        this.sosiski = sosiski -1;
    }

}
