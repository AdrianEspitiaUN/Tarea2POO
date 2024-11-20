/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2poo;

/**
 *
 * @author adria_6
 */
import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args){
        //Utilizamos Scanner para recibir los datos del usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la altura");
        double altura = s.nextDouble();
        System.out.println("Ingrese el ancho");
        double ancho = s.nextDouble();
        
        //Decaramos una variable para calcular el resultado
        double area = ancho*altura;
        System.out.println("El area es "+ area);
    }
}
