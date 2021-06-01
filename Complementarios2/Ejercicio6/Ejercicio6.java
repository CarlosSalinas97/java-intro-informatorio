package Complementarios2.Ejercicio6;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado(1234,"Carlos Rodriguez",160,600);
        Empleado emp2 = new Empleado(3333,"Jose Gonzalez",153,493);
        Empleado emp3 = new Empleado(1111,"Sofia Alegre",130,860);
        Empleado emp4 = new Empleado(2222,"Lucia Segura",80,500);

        HashSet<Empleado> empleados = new HashSet<Empleado>();

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);

        HashMap<Integer, Integer> sueldos = new HashMap<>();
        for (Empleado empleado : empleados) {
            int calc = empleado.getHorasTrabajadas() * empleado.getValorPorHora();
            sueldos.put(empleado.getDni(), calc);
        }

        System.out.println("Sueldos: " + sueldos.toString());

    }
}
