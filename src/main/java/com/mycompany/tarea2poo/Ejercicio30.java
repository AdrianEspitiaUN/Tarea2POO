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
public class Ejercicio30 {
    public static void main(String[] args){
        //Leemos la entrada del usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un entero positivo \n");
        int num = s.nextInt();
        //Imprimiremos los primos menores que la entrada del usuario uno por uno
        System.out.println("Los numeros primos menores que "+num+" son \n");
        int x;
        //Iteramos sobre todos los enteros positivos menores que 'num'
        for(x = num; x>1; x=x-1){
            boolean primo = true;
            int y;
            //Determinamos si 'x' tiene divisores distintos de 1 o 'x'
            for(y = x-1; y>1; y=y-1){
                if(x%y==0){
                    primo = false;
                    break;
                }
            }
            //Si 'x' no tiene divisores distintos de 1 o 'x', entonces es primo
            if(primo == true){
                System.out.println(x+"\n");
            }
        }
    }
}
