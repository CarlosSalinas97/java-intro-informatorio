package Guia;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int continuar = 1;

    do {
      System.out.println("Ingrese la calificación del alumno: ");
      int nota = scan.nextInt();

      calificacion(nota);

      System.out.println("\nDesea continuar?. Presione 1 para continuar, o cualquier otra tecla para salir.");
      continuar = scan.nextInt();
      
    } while ( continuar == 1 );

    scan.close();
  }

  public static void calificacion(int nota){

    if (nota > 93) {

      System.out.println("Excelente");
      
    } else if (nota >= 85) {
      
      System.out.println("Sobresaliente");
      
    } else if (nota >= 75) {

      System.out.println("Distinguido");

    } else if (nota >= 60) {

      System.out.println("Bueno");

    } else {

      System.out.println("Desaprobado");
    }

  }
}
