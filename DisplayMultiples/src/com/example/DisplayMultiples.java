/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o numero : ");
        int numero = scn.nextInt();
        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + "X" + i + " = "+ resultado);
        }
    }

}
