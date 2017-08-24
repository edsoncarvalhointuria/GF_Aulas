
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edney Carvalho
 */
public class HistoriaCodigos {

    public static void contandoHistoria() {
        String gameOver, nome, titulo, queCaminhoSeguir[], seguirPara, falarOuIr[], euVou, charadaUm[], respCharadaUm,
                charadaDois[], respCharadaDois, simNao[], resposta, escolhaGigante[], respostaGigante, pPT[],
                rPPT, gigantePPT, dizerNome;
        int num1, num2, respConta1, respUsConta, respUsConta2, respConta2, escolhaGigantePPT;
        boolean naoEscolhiCaminho = true;
        //Pegando o nome
        Random rdm = new Random();
        num1 = rdm.nextInt(20);
        num2 = rdm.nextInt(10);
        respConta1 = num1 + num2;
        respConta2 = num1 * num2;
        gameOver = "Fim de Jogo";
        nome = JOptionPane.showInputDialog(null, "Digite seu nome :", "Nome", 3);
        titulo = "ContandoHistoria";
        JOptionPane.showMessageDialog(null, "Olá, " + nome + " vamos começar a historia.",
                titulo, -1);
        simNao = new String[]{"Sim", "Não"};
        //Iniciando a historia;
        JOptionPane.showMessageDialog(null, "Certa vez, um jovem chamado " + nome
                + " se perdeu em uma floresta.\nIsso foi muito estranho, "
                + "pois não havia floresta perto de sua casa, mas tanto faz.\nO jovem "
                + "continuou caminhando até que se deparou com três caminhos diferentes.",
                titulo, -1);
        queCaminhoSeguir = new String[]{"Há esquerda", "Em frente", "Há direita"};
        seguirPara = (String) JOptionPane.showInputDialog(null, "Que caminho " + nome + " deve seguir?",
                titulo, -1, null, queCaminhoSeguir, null);
        System.out.println(seguirPara);
        //Caminho da esquerda;
        if (seguirPara == queCaminhoSeguir[0]) {
            naoEscolhiCaminho = false;
            JOptionPane.showMessageDialog(null, "Então ele resolveu ir para esquerda."
                    + "\nComparado com os outros a esquerda parecia o caminho mais sombrio"
                    + " (por que você escolheu ele mesmo?)");
            JOptionPane.showMessageDialog(null, "Depois de um tempo andando " + nome
                    + " se depara com alguns animais conversando (normal não é?, afinal você encontra "
                    + "animais conversando todo dia).\nE " + nome + " tem apenas dua escolhas.",
                    titulo, -1);
            falarOuIr = new String[]{"Falar com os animais", "Sair de fininho"};
            euVou = (String) JOptionPane.showInputDialog(null, "O que " + nome + " deve fazer?",
                    titulo, 3, null, falarOuIr, null);
            // Falar com os Animais
            if (euVou.equals(falarOuIr[0])) {
                JOptionPane.showMessageDialog(null, nome + " se aproxima e tenta se comunicar"
                        + " com os animais.\n(Os animais parecem ser bem legais)...\n" + nome
                        + " pergunta como ele poderia sair da floresta e, os animais dizem que só"
                        + " iriam responder se " + nome + " respondesse duas charadas.");
                charadaUm = new String[]{"terra", "Terra"};
                charadaDois = new String[]{"cinco", "Cinco", "5", "cinco amigos", "5 amigos", "Cinco Amigos", "cinco Amigos"};
                respCharadaUm = JOptionPane.showInputDialog(null, "1- De mim, surge vida, para mim,"
                        + " a vida retorna."
                        + "\nHomens brigam pela minha posse, mas nenhum deles é meu dono."
                        + "\nÁgua me cerca, mas ao redor dela eu vivo."
                        + "\nQuem sou eu, meu amigo?", titulo, 3);
                if (respCharadaUm.equals(charadaUm[0]) || respCharadaUm.equals(charadaUm[1])) {
                    JOptionPane.showMessageDialog(null, "Hum, você é bom, mas o segundo vai estar mais"
                            + " facil que o anterior.", titulo, -1);
                    respCharadaDois = JOptionPane.showInputDialog(null, " 2- Gustavo estava dando "
                            + "uma grande festa."
                            + "\nEle decidiu usar uma ténica para fazer com que muitas pessoas"
                            + " viessem para a festa."
                            + "\nEle convidou seus cinco amigos mais próximos e disse que eles"
                            + " poderiam convidar"
                            + " 4 pessoas."
                            + "\nNo final, quantas pessoas Gustavo convidou para sua festa?", titulo, 3);
                    if (respCharadaDois.equals(charadaDois[0]) || respCharadaDois.equals(charadaDois[1])
                            || respCharadaDois.equals(charadaDois[2]) || respCharadaDois.equals(charadaDois[3])
                            || respCharadaDois.equals(charadaDois[4]) || respCharadaDois.equals(charadaDois[5])
                            || respCharadaDois.equals(charadaDois[6])) {
                        JOptionPane.showMessageDialog(null, "Uau você é bom mesmo, mas é uma pena,"
                                + " pois nós não sabemos de nada."
                                + "\nSó queriamos brincar com você, HAHAHA.", titulo, -1);
                        JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                    } else {
                        JOptionPane.showMessageDialog(null, "Você é muito burro para receber nossa resposta,"
                                + " por isso vamos devorar você");
                        JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Você é muito burro para receber nossa resposta,"
                            + " por isso vamos devorar você");
                    JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                }
            }
            // SAIR DE FININHO
            if (euVou.equals(falarOuIr[1])) {
                JOptionPane.showMessageDialog(null, nome + " decidiu sair de fininho sem"
                        + " alertar os animais, afinal"
                        + " eles pareciam ser loucos.", titulo, -1);
                JOptionPane.showMessageDialog(null, "Depois de um tempo caminhando " + nome
                        + " encontra uma tela verde no meio das arvores."
                        + "\nE um homem ele parecia ser uma pessoa normal.\n"
                        + nome + " estava esperançoso de aquela ser a chance"
                        + " dele sair daquela floresta maluca."
                        + "\nEntão ele se aproxima e", titulo, -1);
                JOptionPane.showMessageDialog(null, "Era apenas um boneco de cera (hahahaha)", titulo, -1);
                JOptionPane.showMessageDialog(null, "Mas derrente na tela verde surgiu um olograma."
                        + "\nEra um rosto de uma pessoa normal, que acaba se revelando Wisdom o dono de"
                        + " toda sabedoria matematica.", titulo, -1);
                JOptionPane.showMessageDialog(null, nome + " explica sua situação e pergunta se tem"
                        + " algum jeito dele sair da floresta."
                        + "\nWisdom diz que se ele responder duas questões matematicas ele"
                        + " responderia apenas uma pergunta.", titulo, -1);

                resposta = (String) JOptionPane.showInputDialog(null, nome + " aceita ou não?", titulo, 3,
                        null, simNao, null);
                if (resposta.equals(simNao[0])) {
                    JOptionPane.showMessageDialog(null, nome + " aceita o desafio e Wisdom pergunta: ",
                            titulo, -1);
                    respUsConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto é " + num1 + " + " + num2 + "?",
                            titulo, 3));
                    if (respUsConta == respConta1) {
                        JOptionPane.showMessageDialog(null, "Bem, você acertou vamos para proxima", titulo, -1);
                        respUsConta2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a multiplicação de " + num1 + " vezes " + num2, titulo, -1));
                        if (respUsConta2 == respConta2) {
                            JOptionPane.showMessageDialog(null, nome + " ficou muito feliz por ter conseguido responder as duas questões."
                                    + "\nE diz a Wisdom todo emocionado : eu ganhei mesmo ?", titulo, -1);
                            JOptionPane.showMessageDialog(null, "Wisdom responde : sim você venceu", titulo, -1);
                            JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                        } else {
                            JOptionPane.showMessageDialog(null, "Você é muito burro a resposta era " + respConta2 + "."
                                    + "\nVou te mandar para uma escola, onde ficara o resto da sua"
                                    + " vida aprendendo matematica.", titulo, -1);
                            JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Você é muito burro a resposta era" + respConta1 + "."
                                + "\nVou te mandar para uma escola, onde ficara o resto da sua"
                                + " vida aprendendo matematica.", titulo, -1);
                        JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, nome + " não aceita."
                            + "\nEntão Wisdom o carboniza");
                    JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                }
            }
        }

        //Em frente
        if (seguirPara == queCaminhoSeguir[1]) {
            naoEscolhiCaminho = false;
            JOptionPane.showMessageDialog(null, nome + " escolheu seguir em frente.", titulo, -1);
            JOptionPane.showMessageDialog(null, "Após um tempo andando ele acaba encontrando um gigante"
                    + "\nO gigante parecia estar dormindo na frente do caminho");
            escolhaGigante = new String[]{"Tentar atravessar correndo", "Chamar a atenção do gigante"};
            respostaGigante = (String) JOptionPane.showInputDialog(null, "O que " + nome + "faz?", titulo, 3, null, escolhaGigante, null);
            if (respostaGigante.equals(escolhaGigante[0])) {
                JOptionPane.showMessageDialog(null, nome + " tenta atravessar correndo."
                        + "\nMas o gigante o vê e pisa em cima dele", titulo, -1);
                JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
            } else if (respostaGigante.equals(escolhaGigante[1])) {
                JOptionPane.showMessageDialog(null, nome + " chama a atenção do gigante."
                        + "\nO gigante levanta e UAU ele é realmente um gigante."
                        + "\n" + nome + " pergunta se ele sabe alguma maneira de sair dali."
                        + "\nO gigante diz que não sabe de nada, mas que se você ganhar dele no Jokenpô"
                        + " ele não o mataria.", titulo, -1);
                pPT = new String[]{"Pedra", "Papel", "Tesoura"};
                rPPT = (String) JOptionPane.showInputDialog(null, "Agora faça sua escolha:", titulo, 1, null,
                        pPT, null);
                escolhaGigantePPT = rdm.nextInt(3);
                gigantePPT = pPT[escolhaGigantePPT];
                boolean empate = false;
                if (rPPT.equals(pPT[0]) && gigantePPT.equals(pPT[0])
                        || rPPT.equals(pPT[1]) && gigantePPT.equals(pPT[1]) || rPPT.equals(pPT[2]) && gigantePPT.equals(pPT[2])) {
                    empate = true;
                    while (empate == true) {
                        JOptionPane.showMessageDialog(null, "Haaa deu empate vamos de novo", titulo, -1);
                        rPPT = (String) JOptionPane.showInputDialog(null, "Agora faça sua escolha:", titulo, 1, null,
                                pPT, null);
                        gigantePPT = pPT[escolhaGigantePPT];
                        if (rPPT.equals(pPT[0]) && gigantePPT.equals(pPT[0])
                                || rPPT.equals(pPT[1]) && gigantePPT.equals(pPT[1])
                                || rPPT.equals(pPT[2]) && gigantePPT.equals(pPT[2])) {
                            //System.out.println("fjlkwsdafa");
                            empate = true;
                        } else {
                            empate = false;
                        }
                        //empate = false;
                    }
                }
                if (rPPT.equals(pPT[0]) && gigantePPT.equals(pPT[1]) || rPPT.equals(pPT[1]) && gigantePPT.equals(pPT[2])
                        || rPPT.equals(pPT[2]) && gigantePPT.equals(pPT[0])) {
                    JOptionPane.showMessageDialog(null, "HAHA eu sou o melhor jogador de Jokenpô do"
                            + " planeta jdfu."
                            + "\nYou Lose", titulo, -1);
                    JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                }
                if (rPPT.equals(pPT[1]) && gigantePPT.equals(pPT[0]) || rPPT.equals(pPT[2]) && gigantePPT.equals(pPT[1])
                        || rPPT.equals(pPT[0]) && gigantePPT.equals(pPT[2])) {
                    JOptionPane.showMessageDialog(null, "Como assim você ganhou?!."
                            + "\nMas promessa é divida, pode passar.", titulo, -1);
                    JOptionPane.showMessageDialog(null, nome + " vê que um pouco a frente do gigante não tem"
                            + " saída apenas uma montanha enorme cobrindo tudo", titulo, -1);
                    JOptionPane.showMessageDialog(null, "Mas ao se aproximar ele vê uma porta."
                            + "\n" + nome + " vai correndo até a porta, finalmente ele vai sair dessa floresta"
                            + " maluca.");
                    JOptionPane.showMessageDialog(null, "Ao abrir a porta ele vê que la não é a saída e sim "
                            + "uma escola."
                            + "\n" + nome + " tenta sair dali, mas a porta se fecha e é impossivel abri-la.",
                            titulo, -1);
                    JOptionPane.showMessageDialog(null, nome + " fica o resto da vida na escola", titulo, -1);
                    JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                }

            }
        }
        
        //Direita
        if (seguirPara == queCaminhoSeguir[2]) {
            naoEscolhiCaminho = false;
            JOptionPane.showMessageDialog(null, nome + " decidiu ir para Direita");
            JOptionPane.showMessageDialog(null, "Depois tempo andando " + nome + " encontra um velho "
                    + "que se apresenta sendo o bruxo da floresta."
                    + "\nO velho não parece nada confiável e, ele pergunta seu nome.", titulo, -1);
            dizerNome = (String) JOptionPane.showInputDialog(null, nome + " diz o nome verdadeiro??", titulo, 3, null, simNao, null);
            String falseName;
            if (dizerNome == simNao[1]) {
                falseName = JOptionPane.showInputDialog(null, "Que nome " + nome + " diz para o bruxo?", titulo, 3);
                JOptionPane.showMessageDialog(null, "O bruxo diz: Ola, " + falseName + " sabia que eu odeio mentiras"
                        + " então adeus", titulo, -1);
                JOptionPane.showMessageDialog(null, "O bruxo lança um feitiço e " + nome + " morre", titulo, -1);
                JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
            } else if (dizerNome == simNao[0]) {
                JOptionPane.showMessageDialog(null, nome + " diz seu verdadeiro nome e o bruxo lhe faz uma pergunta", titulo, -1);
                int dRandom1 = rdm.nextInt(5);
                String rDRandom;
                String respRndom = "" + ((double) dRandom1 + (double) 0.5 + (double) 10);
                rDRandom = JOptionPane.showInputDialog(null, "Quanto é " + dRandom1 + ".5" + " + " + "10", titulo, 3);
                if (rDRandom.equals(respRndom)){
                    JOptionPane.showMessageDialog(null, "Bem você acertou estou com pressa então vou te dizer uma coisa, a saida esta onde você menos espera, pois as vezes ir para traz é ir para frente, adeus.", titulo, -1);
                    System.out.println("nullfrente, nullesquerda, nulldireita");
                    JOptionPane.showMessageDialog(null, "O bruxo depois de dizer estas palavras desaparece e todo o local o começa a desmoronar", titulo, -1);
                    JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                }else{
                    JOptionPane.showMessageDialog(null, "Você é burro demais a resposta era " + respRndom + ", adeus", titulo, -1);
                    JOptionPane.showMessageDialog(null, gameOver, titulo, -1);
                }
            }

        }
        if (seguirPara != queCaminhoSeguir[0] && naoEscolhiCaminho == true
                || seguirPara != queCaminhoSeguir[1] && naoEscolhiCaminho == true
                || seguirPara != queCaminhoSeguir[2] && naoEscolhiCaminho == true) {
            JOptionPane.showMessageDialog(null, nome + " diz que nem pensar ele iria entrar naquela floresta"
                    + " assustadora e maluca."
                    + "\nEntão ele decide voltar para traz e encontra a saida. Na verdade aquilo era apenas um "
                    + "sonho", titulo, -1);
            JOptionPane.showMessageDialog(null, "Você venceu", titulo, -1);
        }

    }

}
