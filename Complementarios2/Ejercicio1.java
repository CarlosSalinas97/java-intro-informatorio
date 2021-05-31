package Complementarios2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int continuar = 1;

        System.out.println("Ranking de ciudades favoritas!");
        do {
            System.out.println("Ingrese una ciudad");
            String ciudad = scan.next();
            ciudades.add(ciudad);

            System.out.println("Desea agregar otra ciudad? Presione 1 para continuar o cualquier otra para salir.");
            continuar = scan.nextInt();

        } while ( continuar == 1 );

        scan.close();

        int i = 1;
        for ( String ciudad : ciudades) {
            System.out.println("#" + i + " - " + ciudad);
            i++;
        }
    }
}
