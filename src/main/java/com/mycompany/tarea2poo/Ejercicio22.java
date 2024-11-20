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
public class Ejercicio22 {
    public static void main(String[] args){
        //Usamos Scanner para leer los datos ingresados por el teclado
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero \n");
        double num = s.nextDouble();
        System.out.println("Los numero impares menores son \n");
        //Utilizamos un ciclo for para imprimir todos los enteros impares
        //menores que el numero ingresado
        int x;
        for(x=1; x<num; x+=2){            
            System.out.println(x);
        }
    }
}
