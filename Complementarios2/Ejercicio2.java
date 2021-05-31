package Complementarios2;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        for ( int i = 1; i <= 5; i++) {
            arrInt.add((int) (1+Math.random()*99));
        }

        System.out.println("Lista antes de agregar elementos: " + arrInt.toString() + " | Tamano: " + arrInt.size());

        arrInt.add(999);

        System.out.println("Lista despues de agregar un elemento en la ultima posicion: " + arrInt.toString() + " | Tamano: " + arrInt.size());

        arrInt.add(0,777);

        System.out.println("Lista despues de agregar un elemento en la primera posicion: " + arrInt.toString() + " | Tamano: " + arrInt.size());

    }
}
