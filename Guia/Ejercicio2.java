package Guia;
import java.util.*;

public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Ingrese tres valores: \n");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    System.out.println("El primer nro ingresado es: "+ a);
    System.out.println("El primer nro ingresado es: "+ b);
    System.out.println("El primer nro ingresado es: "+ c);
    scanner.close();
  }
}