/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;
import java.util.Scanner;



public class RockPaperScissor {

    public static void main(String[] args) {
        //Instaciando
        Random aleatorio = new Random();
        Scanner escolhaOSeu = new Scanner(System.in);
        
        
        //Decisão de escolha
        System.out.println("Escolha pedra(0), papel(1) ou tesoura(2)");
        int numeroDJogador = escolhaOSeu.nextInt();
        String escolhaDoJogador = null;
        
        if (numeroDJogador == 0){
            escolhaDoJogador = "Pedra";
        }else if (numeroDJogador == 1){
            escolhaDoJogador = "Papel";
        }else if (numeroDJogador == 2){
            escolhaDoJogador = "Tesoura";
        }
        
        System.out.println("Você escolheu : " + escolhaDoJogador);
        
        
        //Escolha Aleatoria
        int numAleatorio = aleatorio.nextInt(3);
        String cpu = null;
        
        if (numAleatorio == 0){
            cpu = "Pedra";
        }else if (numAleatorio == 1){
            cpu = "Papel";
        }else if (numAleatorio == 2){
            cpu = "Tesoura";
        }
        
        System.out.println("Eu escolhi :" + cpu);
        
        
        //Resultado
        if (numAleatorio == 0 && numeroDJogador == 1 || numAleatorio == 1 && numeroDJogador == 2 ||
            numAleatorio == 2 && numeroDJogador == 0){
            System.out.println("Uau você venceu!!");
        }else if (numAleatorio == 1 && numeroDJogador == 0 || numAleatorio == 2 && numeroDJogador == 1 ||
                  numAleatorio == 0 && numeroDJogador == 2){
            System.out.println("Ahhhhhh, você perdeu!!");
        }else{
            System.out.println("Empatou!!");
        }
        
        
        //Fechando o Sacanner
        escolhaOSeu.close();

    }
}
