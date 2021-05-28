package Complementarios1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la palabra a imprimir en mayusculas");
        String palabra = scan.nextLine();

        scan.close();

        char letraMayus = 0;
        String palabraMayus = "";

        for (int i = 0; i < palabra.length(); i++) {
            int letraAscii = palabra.charAt(i);
            if ( letraAscii > 96 && letraAscii < 123 ) {
                letraMayus = (char) (letraAscii - 32);
                palabraMayus += letraMayus;
            } else {
                palabraMayus += palabra.charAt(i);
            }
        }
        System.out.println(palabraMayus);
    }
}
