package Complementarios1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero a imprimir");
        int nro = scan.nextInt();

        scan.close();
        int factorial = 1;
        for (int i = 1; i <= nro; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + nro + " es: " + factorial);
    }
}
