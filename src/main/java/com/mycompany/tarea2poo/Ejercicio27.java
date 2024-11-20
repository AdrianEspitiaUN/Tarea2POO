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
public class Ejercicio27 {
    public static void main(String[] args){
        //Leemos la temperatura provista por teclado
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Farenheit \n");
        float farenheit = s.nextFloat();
        //Calculamos la temperatura en Celsius
        if(farenheit-999!=0){
            float celsius = 5*(farenheit-32)/9;
            System.out.println("La temperatura en Celsius es "+ celsius);
        }else{
            System.out.println("La temperatura ingresada es 999");
        }
        
    }
}
