package Complementarios2.Ejercicio6;

public class Empleado {
    private int dni;
    private String nya;
    private int horasTrabajadas;
    private int valorPorHora;

    public Empleado(int dni, String nya, int horasTrabajadas, int valorPorHora) {
        this.dni = dni;
        this.nya = nya;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }


    //GETERS Y SETERS

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNya() {
        return nya;
    }

    public void setNya(String nya) {
        this.nya = nya;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
