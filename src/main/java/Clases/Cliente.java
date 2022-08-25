package Clases;

public class Cliente {

    //Atributos
    public String nombre;
    public String cedula;
    public int edad;
    public String telefono;
    public boolean aplicaDescuento;

    //Constructor

    public Cliente() {
    }

    public Cliente(String nombre, String cedula, int edad, String telefono, boolean aplicaDescuento) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.aplicaDescuento = aplicaDescuento;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String laura, String s, int i, String s1) {
    }

    //Metodo

    public String  saludar(){
        return "Hola";
    }



}
