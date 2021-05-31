package Complementarios2;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
        // Baraja del 1 al 13. Donde As = 1, Jota = 11, Reina = 12, Rey = 13
        for ( int i = 1; i <= 13; i++) {
            arrInt.add(i);
        }

        //Ordenar
        Collections.sort(arrInt);
        System.out.println("Array en orden: " + arrInt.toString());

        //Ordenamiento inverso
        Collections.reverse(arrInt);
        System.out.println("Array en orden inverso: " + arrInt.toString());

        //Orden aleatorio
        Collections.shuffle(arrInt);
        System.out.println("Array en orden aleatorio: " + arrInt.toString());

    }
}
