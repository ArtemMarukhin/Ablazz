package oop.lesson7.recursion;

public class Recursion {

    public int sum(int number){
//        int result = number + number - 1 +number - 2 ... number > 0;
        if(number < 1){
            return 0;
        }
        int result = number+sum(number - 1);
        return result;
    }
}
