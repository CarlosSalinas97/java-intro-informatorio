package Complementarios1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer numero entero");
        int nro1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero");
        int nro2 = scan.nextInt();
        scan.close();

        System.out.println(nro1 + " + " + nro2 + " = " + (nro1+nro2));
        System.out.println(nro1 + " - " + nro2 + " = " + (nro1-nro2));
        System.out.println(nro1 + " * " + nro2 + " = " + (nro1*nro2));
        System.out.println(nro1 + " / " + nro2 + " = " + (nro2!=0?(nro1/nro2):"No se puede dividir por 0"));
        System.out.println(nro1 + " % " + nro2 + " = " + (nro2!=0?(nro1%nro2):"No se puede dividir por 0"));
    }
}
