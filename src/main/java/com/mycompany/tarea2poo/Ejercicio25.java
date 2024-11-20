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
public class Ejercicio25 {
    public static void main(String[] args){
        //Usamos la clase Scanner para leer las entradas del teclado
        Scanner s = new Scanner(System.in);
        System.out.println("Escoja una opcion: \n 1 factorial \n 2 Ackermann");
        int opcion = s.nextInt();
        //Dependiendo de la opción escogida llamamos el metodo 'factorial' o el
        //método 'ackermann'
        if(opcion == 1){
            System.out.println("Escriba un numero entero ");
            long n = s.nextLong();
            long resultado = factorial(n);
            System.out.println(n+"! es igual a "+resultado);
        }else if(opcion == 2){
            System.out.println("Escriba un numero entero");
            long x = s.nextLong();
            System.out.println("Escriba otro numero entero");
            long y = s.nextLong();
            long resultado = ackermann(x,y);
            System.out.println("A("+x+","+y+") es igual a "+ resultado);
        }else{
            System.out.println("La opcion escogida no es valida");
        }
    }
    public static long factorial(long n){
        //Implementación recursiva de la función factorial
        if(n==0){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }
    public static long ackermann(long x, long y){
        //Implementación recursiva de la función de Ackermann
        if(x==0){
            return y+1;
        }else if(y==0){
            return ackermann(x-1, 1);
        }else {
            return ackermann(x-1,ackermann(x,y-1));
        }
    }
}
