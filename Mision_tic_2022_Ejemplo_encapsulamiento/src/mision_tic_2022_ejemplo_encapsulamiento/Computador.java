package mision_tic_2022_ejemplo_encapsulamiento;
public class Computador {
    private String marca;
    private String serial;
    private double precio;
    public Computador(String marca, String serial, double precio) {
        this.marca = marca;//diferenciar atributo de parametro
        this.serial = serial;
        this.precio = precio;
    }
    //setter && getter
    public String getMarca(){
        return this.marca;
    }
    public void serMarca(String marc){
        this.marca = marc;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
    
    
    
}
