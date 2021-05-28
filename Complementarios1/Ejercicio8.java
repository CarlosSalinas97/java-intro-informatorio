package Complementarios1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre y apellido");
        String nomYApe = scan.nextLine();
        System.out.println("Ingrese su edad");
        String edad = scan.nextLine();
        System.out.println("Ingrese su direccion");
        String direccion = scan.nextLine();
        System.out.println("Ingrese su ciudad");
        String ciudad = scan.nextLine();

        scan.close();

        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + nomYApe);
    }
}
