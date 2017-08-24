package com.example;

import javax.swing.JOptionPane;

public class NameMaker {
    
    public static void main(String args[])
    {
        //Entrada de usuario
        String dgtPNome = JOptionPane.showInputDialog(null, "Digite seu primeiro nome:", "PrimeiroNome", 1);
        String dgtNDM = JOptionPane.showInputDialog(null, "Digite seu nome do meio:", "Segundo nome",1);
        String dgtUtmN = JOptionPane.showInputDialog(null, "Digite seu ultimo nome:" , "Ultimo nome" , 1);
        
        //Variaveis
        String primeiroNome, nomeDoMeio, ultimoNome, nomeCompleto;
            primeiroNome = dgtPNome;
            nomeDoMeio = dgtNDM;
            ultimoNome = dgtUtmN;
            nomeCompleto = primeiroNome + " " + nomeDoMeio + " " + ultimoNome;
            System.out.println(nomeCompleto);
    }
    
}
