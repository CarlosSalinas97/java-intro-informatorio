package Complementarios2;

import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {

        System.out.println(fizzBuzz(1,8));
    }

    public static ArrayList<String> fizzBuzz(int min, int max) {
        ArrayList<String> arrFizzBuzz = new ArrayList<String>();

        for ( int i = min; i < max; i++) {
            if ( i % 2 == 0 && i % 3 == 0 ) {
                arrFizzBuzz.add("FizzBuzz");
            } else if ( i % 2 == 0 ) {
                arrFizzBuzz.add("Fizz");
            } else if ( i % 3 == 0 ) {
                arrFizzBuzz.add("Buzz");
            } else {
                arrFizzBuzz.add(Integer.toString(i));
            }
        }

        return arrFizzBuzz;
    }
}
