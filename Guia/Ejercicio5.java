package Guia;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    
    System.out.println("Ingrese el número entero a multiplicar: ");
    Scanner scan = new Scanner(System.in);
    int nro = scan.nextInt();

    for (int i = 1; i<11; i++){
      System.out.println(nro + " * " + i + " = " + nro*i);
    }
    scan.close();
  }
}