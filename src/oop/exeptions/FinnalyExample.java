package oop.exeptions;

public class FinnalyExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Exception e){
            System.out.println("Exception");
        } finally {
            System.out.println(a/b);
            System.out.println("программа работает дальше");
        }



    }
}
