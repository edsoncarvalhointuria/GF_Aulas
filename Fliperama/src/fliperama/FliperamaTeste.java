package fliperama;

import java.text.DecimalFormat;
import java.util.Scanner;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class FliperamaTeste {

    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("######");
        LeitorDeCartao leitor1 = new LeitorDeCartao();
        LeitorDeCartao leitor2 = new LeitorDeCartao();
        LeitorDeCartao leitor3 = new LeitorDeCartao();
        Cartao cartao1 = new Cartao(123123);
        Cartao cartao2 = new Cartao(321321);
        CategoriaDePremios premio1 = new CategoriaDePremios("Fidget Spinner", 10, 2);
        CategoriaDePremios premio2 = new CategoriaDePremios("Dominó de Ouro", 5, 20);
        CategoriaDePremios premio3 = new CategoriaDePremios("Diamante", 6, 5);
        Terminal terminalBoss = new Terminal(leitor1, premio1, premio2, premio3);
        Jogos superMario = new Jogos(leitor2, 10);
        Jogos streetFighter = new Jogos(leitor3, 10);
        Scanner sc = new Scanner(System.in);

    }

}
/*boolean cartao1Ocupado = false;
        boolean cartao2Ocupado = false;
        System.out.println("Ola tome seu cartão o carta1");
        cartao1Ocupado = true;
        boolean ficarNoFliperama = true;
        String erro = "Numero Invalido";
        int numDoSeuCartao = 0;
        String simNao[] = new String[]{"Sim", "Não"};
        JComboBox cb = new JComboBox(simNao);
        String jogos[] = new String[]{"Super Mario", "Street Fighter"};
        JComboBox jogosDisponiveis = new JComboBox(jogos);
        int oqueFazer;
        while (ficarNoFliperama == true) {
            oqueFazer = 0;
            System.out.println("O que você quer fazer"
                    + "\nIr no terminal (0)"
                    + "\nIr Jogar (1)"
                    + "\nIr embora(2)"
                    + "\nChamar um amigo(3)");
            try {
                oqueFazer = sc.nextInt();
            } catch (Exception e) {
                System.out.println(erro);
                continue;
            }

            if (oqueFazer == 0) {
                boolean continuarNoTerminal = true;
                oqueFazer = 0;
                while (continuarNoTerminal == true) {

                    System.out.println("Você foi no terminal agora o que vai querer fazer ?"
                            + "\nChecar os dados do seu cartão(0)"
                            + "\nColocar créditos em seu cartão(1)"
                            + "\nTrocar tiquetes em premios(2)"
                            + "\nTransferir saldo(3)"
                            + "\nTransferir tiquetes(4)"
                            + "\nVer informações do terminal(5)"
                            + "\nSair do terminal(6)");
                    try {
                        oqueFazer = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println(erro);
                        continue;
                    }
                    if (oqueFazer == 0) {
                        terminalBoss.dadosCartao(cartao1);
                    } else if (oqueFazer == 1) {
                        System.out.println("Digite o valor em dinheiro que você ira pagar : ");
                        int valorEmDinheiro = 0;
                        try {
                            valorEmDinheiro = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println(erro);
                            String ss = JOptionPane.showInputDialog(null, "Deseja continuar no terminal ?", cb);
                            if (ss.equals("Sim")) {
                                continuarNoTerminal = true;
                                continue;
                            } else {
                                continuarNoTerminal = false;
                                continue;
                            }
                        }
                        terminalBoss.colocarCreditos(valorEmDinheiro, cartao1);
                    } else if (oqueFazer == 2) {
                        System.out.println("Qual premio você gostaria de trocar ?"
                                + premio1.nome() + " (0)\n" + premio2.nome() + "(1)\n" + premio3.nome() + "(2)");
                        int premio = 0;
                        try {
                            premio = sc.nextInt();
                        } catch (Exception e) {
                            System.out.println(erro);
                            String ss = JOptionPane.showInputDialog(null, "Deseja continuar no terminal ?", cb);
                            if (ss.equals("Sim")) {
                                continuarNoTerminal = true;
                                continue;
                            } else {
                                continuarNoTerminal = false;
                                continue;
                            }
                        }

                        if (premio == 0) {
                            terminalBoss.trocarTiquetesEmPremios(cartao1, premio1);
                        } else if (premio == 1) {
                            terminalBoss.trocarTiquetesEmPremios(cartao1, premio2);
                        } else if (premio == 2) {
                            terminalBoss.trocarTiquetesEmPremios(cartao1, premio3);
                        } else {
                            System.out.println("Este premio não existe.");
                            String ss = JOptionPane.showInputDialog(null, "Deseja continuar no terminal ?", cb);
                            if (ss.equals("Sim")) {
                                continuarNoTerminal = true;
                                continue;
                            } else {
                                continuarNoTerminal = false;
                                continue;
                            }
                        }
                    } else if (oqueFazer == 3) {
                        if (cartao2Ocupado == true) {
                            System.out.println("Digite o valor de tranferencia :");
                            int valorTranferencia = 0;
                            try {
                                valorTranferencia = sc.nextInt();
                            } catch (Exception e) {
                                System.out.println(erro);
                                String ss = JOptionPane.showInputDialog(null, "Deseja continuar no terminal ?", cb);
                                if (ss.equals("Sim")) {
                                    continuarNoTerminal = true;
                                    continue;
                                } else {
                                    continuarNoTerminal = false;
                                    continue;
                                }
                            }
                            terminalBoss.tranferirSaldo(cartao2, valorTranferencia, cartao1);
                        } else {
                            System.out.println("Você não tem amigos para poder fazer a transferencia HUAHUAHUAHUAHUA");
                            String ss = JOptionPane.showInputDialog(null, "Deseja continuar no terminal ?", cb);
                            if (ss.equals("Sim")) {
                                continuarNoTerminal = true;
                                continue;
                            } else {
                                continuarNoTerminal = false;
                                continue;
                            }
                        }
                    } else if (oqueFazer == 4) {
                        if (cartao2Ocupado == true) {
                            System.out.println("Digite o valor da transferencia : ");
                            int valorTransferencia = 0;
                            try {
                                valorTransferencia = sc.nextInt();
                            } catch (Exception e) {
                                System.out.println(erro);
                                String ss = JOptionPane.showInputDialog(null, "Deseja continuar no terminal ?", cb);
                                if (ss.equals("Sim")) {
                                    continuarNoTerminal = true;
                                    continue;
                                } else {
                                    continuarNoTerminal = false;
                                    continue;
                                }
                            }
                            terminalBoss.tranferirTiquetes(cartao2, valorTransferencia, cartao1);
                        } else {
                            System.out.println("Você não tem amigos para poder fazer a transferencia HUAHUAHUAHUAHUA");
                            String ss = JOptionPane.showInputDialog(null, "Deseja continuar no terminal ?", cb);
                            if (ss.equals("Sim")) {
                                continuarNoTerminal = true;
                                continue;
                            } else {
                                continuarNoTerminal = false;
                                continue;
                            }
                        }
                    } else if (oqueFazer == 5) {
                        terminalBoss.dadosTerminal();
                    } else if (oqueFazer == 6) {
                        continuarNoTerminal = false;
                        continue;
                    } else {
                        System.out.println(erro);
                        continue;
                    }

                }
            } else if (oqueFazer == 1) {
                boolean continuarJogando = true;
                while (continuarJogando == true) {
                    String jogar = JOptionPane.showInputDialog(null, "Qual jogo você quer jogar ?", jogosDisponiveis);
                    if (jogar.equals(jogos[0])) {
                        superMario.jogar(cartao1);
                    } else if (jogar.equals(jogos[1])) {
                        streetFighter.jogar(cartao1);
                    } else {
                        System.out.println(erro);
                        String ss = JOptionPane.showInputDialog(null, "Deseja continuar no terminal ?", cb);
                        if (ss.equals("Sim")) {
                            continuarJogando = true;
                            continue;
                        } else {
                            continuarJogando = false;
                            continue;
                        }
                    }
                }

            } else if (oqueFazer == 2) {
                ficarNoFliperama = false;
            } else if (oqueFazer == 3) {
                cartao2Ocupado = true;
                System.out.println("Você chamou seu amigo");
            }
        }
 */


 /*
        //Entrei no fliperama
        terminalBoss.colocarCreditos(10, cartao1);
        terminalBoss.dadosCartao(cartao1);
        terminalBoss.dadosTerminal();
        
        // Fui jogar
        superMario.jogar(cartao1);
        terminalBoss.dadosCartao(cartao1);
        streetFighter.jogar(cartao1);
        terminalBoss.dadosCartao(cartao1);
        
        // Meu Amigo chegou
        terminalBoss.colocarCreditos(100, cartao2);
        terminalBoss.dadosCartao(cartao2);
        
        //Eu e meu amigo fomos Jogar juntos
        superMario.jogar(cartao1);
        
        // Meu amigo vai  me enprestar algum saldo
        terminalBoss.tranferirSaldo(cartao2, 100, cartao1);
        
        //fomos jogar novamente
        superMario.jogar(cartao1, cartao2);
        streetFighter.jogar(cartao1, cartao2);
        
        //Fomos pegar os premios
        terminalBoss.dadosCartao(cartao2);
        terminalBoss.tranferirTiquetes(cartao2, 200, cartao1);
        terminalBoss.tranferirTiquetes(cartao2, cartao2.tiquetes(), cartao1);
        terminalBoss.trocarTiquetesEmPremios(cartao1, premio1);*/
