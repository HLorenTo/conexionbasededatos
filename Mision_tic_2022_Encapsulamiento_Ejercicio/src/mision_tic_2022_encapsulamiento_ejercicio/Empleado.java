package mision_tic_2022_encapsulamiento_ejercicio;
public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    private double sumatotal;
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        
    }
  public void salario(){
      if (edad >=40){
          setSalario(salario+100);
      }
  }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
     public double getSumatotal() {
        return sumatotal;
    }
    public void setSumatotal(double sumatotal) {
        this.sumatotal = sumatotal;
    }
    public String toString(){
        salario();
        return "nombre="+nombre +", apellido="+apellido+", edad="+edad+", salario="+salario;
    }
}
