/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2poo;

/**
 *
 * @author adria_6
 */
//Es necesario importar este paquete para manejar la excepción IOException
import java.io.*;
public class Ejercicio29 {
    static public void main(String[] args){
        //
        System.out.println("Escriba una entrada ");
        
        try{
            int c = System.in.read();
            //El metodo 'read' asigna el entero -1 cuando se ingresa el comando
            //de fin de archivo, en este caso Ctrl + Z
            System.out.println(c);
        }catch(IOException ex){}
        
    }
}
