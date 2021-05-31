package Complementarios2;

import java.util.ArrayList;

public class Ejercicios5 {
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        ArrayList<Integer> saldos = new ArrayList<Integer>();
        int montoTotal = 0;
        
        //El limite sera 5, ya que va del Lun a Vie
        for ( int i = 0; i < 5; i++ ) {
            int saldo = horasTrabajadas.get(i) * valorPorHora.get(i);
            montoTotal += saldo;
            saldos.add(saldo);
        }

        System.out.println("Saldos: " + saldos.toString());
        System.out.println("Total Final: $" + montoTotal);
    }
}
