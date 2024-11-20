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
public class Ejercicio21 {
    public static void main(String[] args){
        //Usamos Scanner para leer las entradas del usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero \n");
        double a = s.nextDouble();
        System.out.println("Ingrese otro numero \n");
        double b = s.nextDouble();
        //Usamos la estructura de control if para encontrar e imprimir el número
        //mayor
        if(a>b){
            System.out.println(a + " es mayor que "+ b);
        } else if(b>a){
            System.out.println(b + " es mayor que "+a);
        } else{
            System.out.println("Los dos numeros son iguales");
        }
    }
}
