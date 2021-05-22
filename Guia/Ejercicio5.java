package Guia;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int continuar = 1;

    do{
      System.out.println("Ingrese el número entero a multiplicar: ");
    
      int nro = scan.nextInt();

      for (int i = 1; i<11; i++){
        System.out.println(nro + " * " + i + " = " + nro*i);
      }

      System.out.println("\nDesea continuar?. Presione 1 para continuar, o cualquier otra tecla para salir.");
      continuar = scan.nextInt();

    } while ( continuar == 1 ); 

    scan.close();
  }
}