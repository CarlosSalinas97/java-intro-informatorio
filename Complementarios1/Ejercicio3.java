package Complementarios1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero a imprimir");
        int nro = scan.nextInt();

        scan.close();
        String escalera = "";

        for ( int i = 1; i <= nro; i++) {
            escalera = escalera + i;
            System.out.println(escalera);
        }
    }
}
