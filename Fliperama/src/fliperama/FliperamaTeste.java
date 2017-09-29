package fliperama;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class FliperamaTeste {

    public static void main(String[] args) {
        teste();
    }

    public static void teste() {
        Scanner sc = new Scanner(System.in);
        LeitorDeCartao leitor1 = new LeitorDeCartao();
        LeitorDeCartao leitor2 = new LeitorDeCartao();
        LeitorDeCartao leitor3 = new LeitorDeCartao();
        Cartao cartao1 = new Cartao(123123);
        Cartao cartao2 = new Cartao(321321);
        CategoriaDePremios premio1 = new CategoriaDePremios("Playstation", 10, 5);
        CategoriaDePremios premio2 = new CategoriaDePremios("HandSpinner", 15, 2);
        CategoriaDePremios premio3 = new CategoriaDePremios("PcGamer", 5, 1);
        Terminal terminal = new Terminal(leitor1, premio1, premio2, premio3);
        Jogos mario = new Jogos(leitor2, 10.50);
        Jogos StreetFight = new Jogos(leitor3, 5.10);

        int numCartao = 0;
        while (true) {
            int oqueFazer = 0;
            System.out.println("Oque voce quer fazer:"
                    + "\n\nIr no terminal(0)"
                    + "\nIr jogar(1)"
                    + "\nChamr um amigo(2)"
                    + "Ir embora(3)"
                    + "\n\nDigite:\n");
            try {
                oqueFazer = sc.nextInt();
            } catch (Exception e) {
                sc.next();
                System.err.println("\nNumero invalido\n");
                continue;
            }

            if (oqueFazer == 0) {
                while (true) {
                    System.out.println("Você foi até o terminal. Oque gostaria de fazer?");
                    System.out.println("\nVer informaçoes do terminal(0)"
                            + "\nColocar Creditos(1)"
                            + "\nTrocar tiquetes em premios(2)"
                            + "\nVer dados do seu cartao(3)"
                            + "\nTranferir saldo de um cartao para o outro(4)"
                            + "\nTranferir tiquetes de um cartao para o outro(5)"
                            + "\nSair do terminal(6)"
                            + "\n\nDigite:\n");

                    try {
                        oqueFazer = sc.nextInt();
                    } catch (Exception e) {
                        sc.next();
                        System.err.println("\nNumero invalido\n");
                        continue;
                    }

                    if (oqueFazer == 0) {
                        terminal.dadosTerminal();
                    } else if (oqueFazer == 1) {

                        System.out.println("Digite o valor em dinheiro : ");
                        int valorEmDinheiro = 0;

                        try {
                            valorEmDinheiro = sc.nextInt();
                        } catch (Exception e) {
                            sc.next();
                            System.err.println("\nNumero invalido\n");
                            continue;

                        }
                        terminal.colocarCreditos(valorEmDinheiro, cartao1);

                    } else if (oqueFazer == 2) {
                        System.out.println("\nVocê gostaria de qual premio:\n");
                        System.out.println(premio1.nome() + "(0)"
                                + "\n" + premio2.nome() + "(1)"
                                + "\n" + premio3.nome() + "(2)");

                        try {
                            oqueFazer = sc.nextInt();
                        } catch (Exception e) {
                            sc.next();
                            System.err.println("\nNumero invalido\n");
                            continue;

                        }

                        if (oqueFazer == 0) {
                            terminal.trocarTiquetesEmPremios(cartao1, premio1);
                        } else if (oqueFazer == 1) {
                            terminal.trocarTiquetesEmPremios(cartao1, premio2);
                        } else if (oqueFazer == 2) {
                            terminal.trocarTiquetesEmPremios(cartao1, premio3);
                        } else {
                            System.out.println("Numero Invalido");
                            continue;
                        }
                    } else if (oqueFazer == 3) {
                        terminal.dadosCartao(cartao1);
                    } else if (oqueFazer == 4) {
                        System.out.println("Digite o quanto você quer transferir :");
                        int valorEmDinheiro = 0;
                        try {
                            valorEmDinheiro = sc.nextInt();
                        } catch (Exception e) {
                            sc.next();
                            System.err.println("\nNumero invalido\n");
                            continue;
                        }
                        terminal.tranferirSaldo(cartao2, valorEmDinheiro, cartao1);
                    } else if (oqueFazer == 5) {
                        System.out.println("Digite o quanto você quer transferir :");
                        int valorEmTiquetes = 0;
                        try {
                            valorEmTiquetes = sc.nextInt();
                        } catch (Exception e) {
                            sc.next();
                            System.err.println("\nNumero invalido\n");
                            continue;
                        }
                        terminal.tranferirTiquetes(cartao2, valorEmTiquetes, cartao1);
                    } else if (oqueFazer == 6) {
                        break;
                    } else {
                        System.out.println("Numero invalido");
                    }
                }
            } else if (oqueFazer == 1) {
                while (true) {
                    System.out.println("Qual jogo voce gostaria de jogar:"
                            + "\nSuperMario(0)"
                            + "\nStreetFighter(1)");

                    try {
                        oqueFazer = sc.nextInt();
                    } catch (Exception e) {
                        sc.next();
                        System.err.println("\nNumero invalido\n");
                        continue;
                    }
                    if (oqueFazer == 0) {
                        mario.jogar(cartao1);
                    } else if (oqueFazer == 1) {
                        StreetFight.jogar(cartao1);
                    } else {
                        System.out.println("Numero invalido");
                        continue;
                    }
                    
                    System.out.println("Quer continuar jogando:"
                            + "\n\nSim(0)"
                            + "\nNao(1)");
                    try {
                        oqueFazer = sc.nextInt();
                    } catch (Exception e) {
                        sc.next();
                        System.err.println("\nNumero invalido\n");
                        continue;
                    }
                    
                    if (oqueFazer == 0) {
                        continue;
                    } else if (oqueFazer == 1) {
                        break;
                    }else{
                        System.out.println("Numero errado");
                        break;
                    }
                }
            } else if (oqueFazer == 2) {
                System.out.println("Eu estou com preguiça de progamar isso flw");
                continue;
            } else if (oqueFazer == 3) {
                System.out.println("Flw");
                break;
            } else {
                System.out.println("Numero errado");
                continue;
            }

        }
    }
}
