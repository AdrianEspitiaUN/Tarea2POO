/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2poo;

/**
 *
 * @author adria_6
 */
public class Ejercicio16 {
    public static void main(String[] args){
        //Declaramos una variable 'x' que será el índice del bucle
        //Declaramos una variable 'prod' que llevará la cuenta del producto
        long x;
        long prod = 1;
        for(x=1; x<=20; x++){
            prod *= x;
        }
        System.out.println(prod);
    }
}
