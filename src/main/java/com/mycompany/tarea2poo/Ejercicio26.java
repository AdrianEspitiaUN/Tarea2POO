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
public class Ejercicio26 {
    public static void main(String[] args){
        //Utilizamos la clase Scanner para leer las entradas por teclado
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un entero positivo \n");
        int a = s.nextInt();
        System.out.println("Ingrese otro entero positivo \n");
        int b = s.nextInt();
        System.out.println("Ingrese otro entero positivo \n");
        int c = s.nextInt();
        //Hallamos el menor y el mayor número ingresado
        Integer[] enteros = {a,b,c};
        long max = Collections.max(Arrays.asList(enteros));
        long min = Collections.min(Arrays.asList(enteros));
        System.out.println("El menor entero es "+min+" y el mayor entero es "+max);
        
        
    }
}
