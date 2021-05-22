package Guia;
import java.util.*;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int continuar = 1;

    do{

      System.out.println("Ingrese tres valores: \n"); 
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();

      System.out.println("El primer nro ingresado es: "+ a);
      System.out.println("El primer nro ingresado es: "+ b);
      System.out.println("El primer nro ingresado es: "+ c);

      System.out.println("\nDesea continuar?. Presione 1 para continuar, o cualquier otra tecla para salir.");
      continuar = scanner.nextInt();

    } while ( continuar == 1);
    
    scanner.close();
  }
}