/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.daw.programming;

import java.util.Scanner;

/**
 *
 * @author Belmar
 */
public class Challenge3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Introduzca el valor del numero 1: ");
        Scanner keyboard = new Scanner(System.in);
        int numero1 = keyboard.nextInt();    
        System.out.println("Introduzca el valor del numero 2: ");
        int numero2 = keyboard.nextInt();    

if(numero1 > numero2) {
  System.out.println(numero1 + "es mas grande que" + numero2);
}
else if(numero1 == numero2) {
  System.out.println("el numero 1 es igual que numero 2");
}
else{
  System.out.println(numero2 + "es mas grande que" + numero1);
}
    }
}
