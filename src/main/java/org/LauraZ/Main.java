package org.LauraZ;

import Clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creo un objeto de la clase Producto
        Producto producto = new Producto();
        System.out.println("El nombre del producto es : " + producto.nombre);

        Producto producto2= new Producto("Empanada",2000,"Rica");


        Cliente cliente2 = new Cliente("Laura","12344",12,"123", true);


        }

    }

