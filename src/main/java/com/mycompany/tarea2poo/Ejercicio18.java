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
public class Ejercicio18 {
    public static void main(String[] args){
        //Utilizamos la clase Scanner para leer una entrada del usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un entero \n");
        //Declaramos la variable 'a' y le asignamos el valor ingresado por el
        //usuario
        long a = s.nextLong();
        //Efectuamos la suma de los siguientes 100 enteros
        long x;
        long sum = 0;
        for(x=a; x<=a+100; x++){
            sum += x;
            System.out.println("La suma parcial adicionando "+x+" es "+ sum);
        }
    }
}
