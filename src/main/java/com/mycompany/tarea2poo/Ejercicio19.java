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
public class Ejercicio19 {
    public static void main(String[] args){
        //Definimos la razón de cambio como 1.06 dólares por cada euro
        double razon = 1.06;
        //Utilizamos la clase Scanner para recibir la entrada del usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros \n");
        double eur = s.nextDouble();
        //Declaramos una variable para realizar el cálculo y la imprimimos
        double dol = eur*razon;
        System.out.println("La cantidad de dolares es "+ dol);
        
    }
}
