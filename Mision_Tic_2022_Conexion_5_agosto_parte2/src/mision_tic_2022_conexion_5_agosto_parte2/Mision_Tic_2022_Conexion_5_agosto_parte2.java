package mision_tic_2022_conexion_5_agosto_parte2;
import Controlador.Controlador;
import Modelo.Persona;
import Vista.Ventana;
public class Mision_Tic_2022_Conexion_5_agosto_parte2 {
    public static void main(String[] args) {
        Persona modelo = new Persona();
        Ventana vista = new Ventana();
        
        Controlador ctrl = new Controlador(modelo,vista);
        ctrl.iniciar();
    }
    
}
