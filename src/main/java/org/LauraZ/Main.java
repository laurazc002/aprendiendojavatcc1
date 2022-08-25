package org.LauraZ;

import Clases.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Crear un objeto de la clase Producto
        Producto producto = new Producto();

        //Crear un objeto de la clase Scanner
        Scanner entradaPorTeclado = new Scanner(System.in);

        //Preguntarle al usuario el nombre del Producto
        System.out.println("El producto es: " + producto.nombre);

        System.out.println("Digite el nombre del producto: ");
        producto.nombre = entradaPorTeclado.next();

        System.out.println("El producto es: " + producto.nombre);

        //Quiero crear un objeto de la clase Cliente
        Cliente cliente = new Cliente();

        //Pedir datos
        System.out.println("Digite su nombre: ");
        cliente.nombre= entradaPorTeclado.next();
        System.out.println("Su nombre es: " + cliente.nombre);

        System.out.println("Digite su cedula. ");
        cliente.cedula = entradaPorTeclado.next();
        System.out.println("Su cedula es: " + cliente.cedula);

        System.out.println("Digite su edad: ");
        cliente.edad= Byte.parseByte(entradaPorTeclado.next());
        System.out.println("Su edad es: " + cliente.edad);

        System.out.println("Digite su telefono: ");
        cliente.telefono= entradaPorTeclado.next();
        System.out.println("Su nombre es: " + cliente.telefono);

        System.out.println("Aplica descuento: ");
        cliente.aplicaDescuento= Boolean.parseBoolean(entradaPorTeclado.next());
        System.out.println("Si aplica descuento");





        }

    }

