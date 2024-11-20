package oop.exeptions;

public class ExeptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

//        if (true){
//            throw new ArithmeticException("Деление на ноль");
//        }
//
//        System.out.println(a/b);
//        System.out.println("Какието действия ");

        try {
            int[] ints = new int[2];
            System.out.println(ints[4]);
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("ой, произошла арифметическая ошибка : " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ой, произошла ошибка связанная с массивом : " + e.getMessage());

        }

        System.out.println("Программа работает дальше");
    }
}
