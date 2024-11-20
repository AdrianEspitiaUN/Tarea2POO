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
public class Ejercicio24 {
    public static void main(String[] args){
        //Utilizamos la clase Scanner para leer los datos del usuario
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el coeficiente a \n");
        double a = s.nextDouble();
        System.out.println("Ingrese el coeficiente b \n");
        double b = s.nextDouble();
        System.out.println("Ingrese el coeficiente c \n");
        double c = s.nextDouble();
        //Usamos la estructura de control if para determinar si la ecuación tiene
        //solución
        double disc = b*b-4*a*c;
        if(disc>=0){
            double sol1 = (-b + Math.sqrt(disc))/(2*a);
            double sol2 = (-b - Math.sqrt(disc))/(2*a);
            System.out.println("Las soluciones son "+ sol1+" y "+sol2 );
        }else{
            System.out.println("La ecuacion no tiene soluciones reales");
        }
    }
}
