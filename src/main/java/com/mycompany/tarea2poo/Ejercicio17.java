/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2poo;

/**
 *
 * @author adria_6
 */
public class Ejercicio17 {
    public static void main(String[] args){
        //Utilizamos un ciclo for para efectuar la suma de los cuadrados
        // de los primeros 100 naturales. En cada paso imprimimos la suma parcial
        long x;
        long sum = 0;
        for(x=0; x<=100; x++){
            sum += x*x;
            System.out.println("la suma hasta x="+x+" es: "+ sum);
        }
    }
}
