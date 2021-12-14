package mision_tic_2022_ejemplo_encapsulamiento;
import java.util.Scanner;
public class Mision_tic_2022_Ejemplo_encapsulamiento {
    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);
        /*System.out.println("Ingrese los parámetros");
        System.out.println("La marca: ");
        String m = sc.nextLine();
        System.out.println("El serial: ");
        String s = sc.nextLine();
        System.out.println("El precio: $");
        double p = sc.nextDouble();*/
        Computador c1 = new Computador("HP", "834602", 2000000);
        System.out.println("La marca del computador es "+c1.getMarca()+ " el serial es "+c1.getSerial()+" el precio "+c1.getPrecio());
        c1.setPrecio(3000000);
        System.out.println("La marca del computador es "+c1.getMarca()+ " el serial es "+c1.getSerial()+" el precio "+c1.getPrecio());
    }
    
}
