package Complementarios2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<String>();

        estudiantes.add("Carlos"); //1
        estudiantes.add("Federico");
        estudiantes.add("Sofia");
        estudiantes.add("Pedro");
        estudiantes.add("Maximiliano");
        estudiantes.add("Florencia"); //6
        estudiantes.add("Lurdes");
        estudiantes.add("Gabriela");
        estudiantes.add("Ramiro");
        estudiantes.add("Ezequiel");
        estudiantes.add("Juan Carlos");
        estudiantes.add("Ivan"); //12

        System.out.println("Lista de estudiantes: " + estudiantes.toString());

        List<String> curso1 = estudiantes.subList(0,4);
        List<String> curso2 = estudiantes.subList(5,8);
        List<String> curso3 = estudiantes.subList(9,12);

        System.out.println("Curso 1: " + curso1.toString());
        System.out.println("Curso 2: " + curso2.toString());
        System.out.println("Curso 3: " + curso3.toString());

    }
}
