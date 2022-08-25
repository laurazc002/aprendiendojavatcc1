package org.LauraZ;

public class Producto {

    //Atributos
    String nombre;
    int precioUnitario;
    String descripcion;

    //Constructor


    public Producto() {
    }

    public Producto(String nombre, int precioUnitario, String descripcion) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public double calcularIva(){
        return 0.0;
    }


}
