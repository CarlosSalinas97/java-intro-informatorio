package Complementarios1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un texto cualquiera");
        String texto = scan.nextLine();
        System.out.println("Ingrese la letra a buscar");
        String letra = scan.nextLine();
        scan.close();

        int contador = 0;
        for ( int i = 0; i < texto.length(); i++ ) {
            char aux = texto.charAt(i);
            if ( letra.charAt(0) == aux ) {
                contador++;
            }
        }
        System.out.println("La letra '" + letra + "' se repite: " + contador + " veces.");
    }
}
