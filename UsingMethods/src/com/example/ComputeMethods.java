/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;

public class ComputeMethods {

    public static void convercaoFahrenheit(double fahrenheit){
        double convercao = (fahrenheit - 32.0) / 1.8;
        System.out.println(convercao);
    }
    
    public static void hipotenusa(int a , int b){
        double catetos = (Math.pow(a , 2)) + (Math.pow(b , 2));
        double hipotenusa = Math.sqrt(catetos);
        System.out.println(hipotenusa);
    }
    
    public static void dados(){
        Random rdm = new Random();
        int dado1, dado2, somaDosDados;
        dado1 = rdm.nextInt(7) + 1;
        dado2 = rdm.nextInt(7) + 1;
        somaDosDados = dado1 + dado2;
        System.out.println("No primeiro dado saiu: " + dado1 + ". No segundo saiu: " + dado2 + ". E a soma"
                + " deles são: " + somaDosDados);
    }
}
