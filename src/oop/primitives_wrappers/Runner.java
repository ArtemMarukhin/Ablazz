package oop.primitives_wrappers;


public class Runner {

    public static void main(String[] args) {
        String text = "1000";
        int number = Integer.parseInt(text);
        System.out.println(number * 2);
        Integer numberWrapper = null;
        System.out.println(numberWrapper *3);

        Boolean bol = true;
        Long lo = 100l;
        Character Charr = '2';
        Double doub = 20.3;

    }
}
