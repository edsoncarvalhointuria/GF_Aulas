/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long pin = 123123321321L;
        System.out.println("Digite o Pin por favor :");
        long digitarPin = scn.nextLong();
        while (digitarPin != pin) {
            System.out.println("Pin incorreto favor digitar novamente : ");
            digitarPin = scn.nextLong();
        }
        System.out.println("Parabens você entrou em sua conta.");
    }
}
