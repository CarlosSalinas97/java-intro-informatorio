package Guia;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Ingrese la calificación del alumno: ");
    Scanner scan = new Scanner(System.in);
    int calificacion = scan.nextInt();

    if (calificacion > 93) {

      System.out.println("Excelente");
      
    } else if (calificacion >= 85) {
      
      System.out.println("Sobresaliente");
      
    } else if (calificacion >= 75) {

      System.out.println("Distinguido");

    } else if (calificacion >= 60) {

      System.out.println("Bueno");

    } else {

      System.out.println("Desaprobado");
    }

    scan.close();
  }
}
