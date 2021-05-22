package Guia;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int continuar = 1;

    do {
      
      System.out.println("Ingrese el nro del día de la semana (La semana comienza en Domingo): ");
      int diaSemana = scan.nextInt();

      dia(diaSemana);

      System.out.println("\nDesea continuar?. Presione 1 para continuar, o cualquier otra tecla para salir.");
      continuar = scan.nextInt();

    } while ( continuar == 1 );

    scan.close();
  }

  public static void dia (int diaSemana){
    String DIAS[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

    System.out.println("\nEl día de la semana es: " + DIAS[diaSemana-1]);
  }
}
