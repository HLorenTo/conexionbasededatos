package mision_tic_2022_encapsulamiento_ejercicio;
public class Mision_tic_2022_Encapsulamiento_Ejercicio {
    public static void main(String[] args) {
        Empleado empleado = new Empleado ("Pepito", "Perez",23,2000000);
        System.out.println(empleado.toString());
        empleado.setEdad(41);
        System.out.println(empleado.toString());
    }
    
}
