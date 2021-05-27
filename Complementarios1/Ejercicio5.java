package Complementarios1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero");
        int nro1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int nro2 = scan.nextInt();
        scan.close();

        int suma = 0;
        for ( int i = 1; i <= nro2; i++) {
            suma += nro1;
        }

        System.out.println(nro1 + " x " + nro2 + " = " + suma);
    }
}
