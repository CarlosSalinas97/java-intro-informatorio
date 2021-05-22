package Guia;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    
    String DIAS[] = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

    System.out.println("Ingrese el nro del día de la semana (La semana comienza en Domingo): ");
    Scanner scan = new Scanner(System.in);
    int diaSemana = scan.nextInt();

    System.out.println("\nEl día de la semana es: " + DIAS[diaSemana-1]);

    scan.close();
  }
}
