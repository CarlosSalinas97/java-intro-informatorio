package Complementarios1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero");
        int nro1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int nro2 = scan.nextInt();
        scan.close();

        int potencia = 1;
        for ( int i = 1; i <= nro2; i++) {
            potencia *= nro1;
        }

        System.out.println(nro1 + " elevado a " + nro2 + " = " + potencia);
    }
}
