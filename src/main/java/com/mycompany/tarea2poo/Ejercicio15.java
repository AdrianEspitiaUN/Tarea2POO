/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2poo;

/**
 *
 * @author adria_6
 */
public class Ejercicio15 {
    public static void main(String[] args){
        //Declaramos la variable 'x' que se utilizará para guardar los números
        //naturales. La variable 'cuadrado' guardará los números al cuadrado.
        //Utilizamos un bucle for para calcular e imprimir los cuadrados.
        int x;
        int cuadrado;
        for(x=0; x<=30; x++){
            cuadrado = x*x;
            System.out.println(x+"^2="+cuadrado);
        }
    }
}
