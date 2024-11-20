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
public class Ejercicio23 {
    public static void main(String[] args){
        //Utilizamos Scanner para leer los datos ingresados por el usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un entero \n");
        long a = s.nextLong();
        System.out.println("Ingrese otro entero \n");
        long b = s.nextLong();
        long result = mcd(a, b);
        System.out.println("El maximo comun divisor es "+ result);
    }
    public static long mcd(long a, long b){
        //Determinamos el mayor y el menor de los numeros
        long m = Math.max(a, b);
        long n = Math.min(a, b);
        long r = m%n;
        if(r==0){
            return n;
        } else{
            return mcd(n, r);
        }
    }
}
