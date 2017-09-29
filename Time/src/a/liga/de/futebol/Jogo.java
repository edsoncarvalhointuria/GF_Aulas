package a.liga.de.futebol;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

    //ArraysLists
    private ArrayList<Time> times = new ArrayList();
    private ArrayList<Time> ordemDosAdversarios = new ArrayList();
    private ArrayList<Time> timesDaCasa = new ArrayList();
    private ArrayList<Time> timesDeFora = new ArrayList();

    //Objetos Java
    private Random rdm = new Random();
    private Scanner sc = new Scanner(System.in);

    //Meus Objetos
    private Temperatura temperatura = new Temperatura();
    private Campo campoDoJogo;

    //Variaveis Usadas
    private boolean estaFrio;
    private boolean estaCalor;
    private int einverno;
    private boolean continuarLoop = true;
    private int numDePartidas;
    private double mediaTemperatura = 0;
    private double maiorTemperatura = 0;

    public Jogo(Time time1, Time time2, Time time3, Time time4, Campo campoDoJogo) {
        times.add(time1);
        times.add(time2);
        times.add(time3);
        times.add(time4);
        this.campoDoJogo = campoDoJogo;

    }

    public void jogar() {//Metodo que gerara a simulçao do jogo
        while (continuarLoop == true) {//Metodo ficara ativo ate o eInverno ser >= 3
            addOrdemDosTimes();//Metodo que adiciona a ordem dos times
            addTimesDaCasa();//Adiciona os times da casa e de fora
            addTemperatura();//Pede a o usuario a temperatura
            if (einverno >= 3) {//Ve se a Variavel eInvarno e >= 3
                System.out.println("\nJa é inverno a liga esta encerrada\n");
                System.out.println("***** Resultados *****");

                for (int i = 0; i < 4; i++) {//Loop que adiciona os dados dos times
                    System.out.println("\nTime " + times.get(i).getNomeEquipe() + ": ");
                    System.out.println("Vitorias: " + times.get(i).getVitorias()
                            + ", Derrotas: " + times.get(i).getDerrotas()
                            + ", Empates: " + times.get(i).getEmpates()
                            + "\nGols Marcados: " + times.get(i).getGolsMarcados()
                            + ", Gols Sofridos: " + times.get(i).getGolsSofridos());
                }//Fim do loop
                if (numDePartidas >0) {//Se a variavel numDePartidas for >0
                    resultados();//Chama o metodo resultados
                }
                mediaTemperatura();//Chama o metodo mediaTemperatura
                break;//Finaliza o loop
            } else if (estaFrio == true) {//se a variavel estaFrio for true 
                System.out.println("\nEsta muito para os times jogarem");
                estaFrio = false;//Ele a tranforma em false
                removeTimes();//Chama o metodo removeTimes
                continue;//Volta pro começo do loop
            } else {//Se nenhuma das opçoes for verdadeira
                partida();//Chama o metodo partida
                removeTimes();//Remove os times
            }//Fim do if else
            numDePartidas++;//Aumenta um numero de partidas
        }//Fim do loop

    }//Fim do metodo

    private void resultados() {//Metodo que gera os resultados de todos os jogos
        for (int i = 0; i < numDePartidas; i++) {//Loop que gerara os resultados Do jogo
            //O sera repetido conforme o numero de partidas que ouveram
            System.out.println("\nJogo #" + (i + 1) + " :\n");
            System.out.print("Temperatura: ");
            System.out.print(temperatura.getTemperatura().get(i));

            String timeDaCasa = "";//Variavel que ficara os nomes dos times da casa
            String timeDeFora = "";//Variavel que ficara os nomes dos times de fora
            for (int j = 0; j < 4; j++) {//Loop que colocara os nomes nas variaveis
                if (timesDaCasa.get(j) == null) {//Compara c o objeto no local i eh nulo
                    timeDaCasa += "";//Se sim adiciona nada
                } else {//Se não adiciona o nome mais uma virgula e um espaço 
                    timeDaCasa += timesDaCasa.get(j).getNomeEquipe() + ", ";
                }
                if (timesDeFora.get(j) == null) {
                    timeDeFora += "";
                } else {
                    timeDeFora += timesDeFora.get(j).getNomeEquipe() + ", ";
                }
            }//Fim do Loop
            timeDeFora += "1";//Adiciona um para facil localizaçao
            timeDeFora = (timeDeFora.equals("1")) ? "0" : timeDeFora.replace(", 1", ".");//Remove a ultima virgula e espaço do final
            timeDaCasa += "1";
            timeDaCasa = (timeDaCasa.equals("1")) ? "0" : timeDaCasa.replace(", 1", ".");

            System.out.println("\nTimes De Fora: " + timeDeFora
                    + "\nTimes Da Casa: " + timeDaCasa);
        }//Fim do loop
    }//Fim Do metodo

    private void partida() {
        int[] golsMarcados = new int[]{addGols(), addGols(), addGols(), addGols()};

        for (int i = 0; i < 2; i++) {
            //Mudara Na segunda Volta do Loop
            int k = (i == 0) ? 0 : 1;//Ajudara a pegar os objetos na arraylist

            System.out.println("\n**** O jogo " + (i + 1) + " vai ser entre " + ordemDosAdversarios.get(i + k).getNomeEquipe()
                    + " Vs " + ordemDosAdversarios.get(i + k + 1).getNomeEquipe() + " ****");
            System.out.println("\nO time " + ordemDosAdversarios.get(i + k).getNomeEquipe()
                    + " marcou " + golsMarcados[i + k] + " gols"
                    + "\nO time " + ordemDosAdversarios.get(i + 1 + k).getNomeEquipe() + " marcou " + golsMarcados[i + 1 + k] + " gols");

            //Adc os gols marcados e sofridos dos times
            ordemDosAdversarios.get(i + k).setGolsMarcados(golsMarcados[i + k]);
            ordemDosAdversarios.get(i + 1 + k).setGolsMarcados(golsMarcados[i + 1 + k]);
            ordemDosAdversarios.get(i + k).setGolsSofridos(golsMarcados[i + 1 + k]);
            ordemDosAdversarios.get(i + 1 + k).setGolsSofridos(golsMarcados[i + 1]);

            //Adiciona a vitoria, derrota e empate dos times
            if (golsMarcados[i + k] > golsMarcados[i + 1 + k]) {
                System.out.println("\nO time " + ordemDosAdversarios.get(i + k).getNomeEquipe() + " ganhou a partida.");
                ordemDosAdversarios.get(i + k).setVitoria(1);
                ordemDosAdversarios.get(i + 1 + k).setDerrota(1);
            } else if (golsMarcados[i + k] < golsMarcados[i + 1 + k]) {
                System.out.println("\nO time " + ordemDosAdversarios.get(i + k + 1).getNomeEquipe() + " ganhou a partida.");
                ordemDosAdversarios.get(i + k).setDerrota(1);
                ordemDosAdversarios.get(i + 1 + k).setVitoria(1);
            } else {
                System.out.println("\nDeu Empate");
                ordemDosAdversarios.get(i + k).setEmpate(1);
                ordemDosAdversarios.get(i + 1 + k).setEmpate(1);
            }

        }//Final do loop
    }//final do metodo

    private int addGols() {//Metodo q adiciona os gols aleatoriamente
        int gls;//Variavel q gerara os gols feitos
        if (estaCalor == true) {//Se a temperatura adicionada for muito alta os gols seram maiores
            gls = rdm.nextInt(6);//gols aleatoria de 0 a 5
        } else {
            gls = rdm.nextInt(3);
        }
        return gls;
    }//Fim do metodo

    private void addTemperatura() {//Metodo com entrada Scanner q pede para o usuario adicionar uma temperatura
        double temperatura = 0;//Variavel q recebera o valor 

        while (true) {//Loop para não dar erro no que o usuario digitar
            System.out.println("\nDigite a temperatura do jogo (Exemplo = 20,50) : ");

            try {//Inicio try catch
                temperatura = sc.nextDouble();//O usuario adiciona um valor
                this.temperatura.addTemperatura(temperatura);
                //System.out.println(this.temperatura.getTemperatura());
                //System.out.println(temperatura);
                break;
            } catch (Exception e) {
                sc.next();//se o usuario colocar uma letra o sc.next a recebe
                System.out.println("Adicione um numero");
                continue;//voltar para o começo do loop
            }
        }//Fim do loop

        if (temperatura < 20) {//Checa o valor da temperatura
            estaFrio = true;//se for muito baixa o valor a variavel vira verdadeira
            einverno++;//Contagem para ver c ja é inverno
            //System.out.println("Ta frio");
        } else if (temperatura > 35) {//C a temperatura for muito alta
            estaCalor = true;//A variavel fica true
            //System.out.println("Ta calor");
        }

    }//Fim do metodo

    private void removeTimes() {//Metodo que remove todos times da variavel ordemDosAdversarios
        for (int i = 0; i < 4; i++) {//Loop para poder remover os quatro
            ordemDosAdversarios.remove(times.get(i)); //Metodo que remove o objeto da variavel
        }
    }//Fim do metodo

    private void addOrdemDosTimes() {//Metodo q Adiciona os times aleatoriamente em um ArrayList
        boolean i1 = false, i2 = false, i3 = false, i4 = false, continuarloop = true;//Variaveis que ajuda a não repetir nenhum objeto Time
        while (continuarloop == true) {//Loop que faz a comparação de todos os Times e os adiciona na ArrayList
            int rdmNum = rdm.nextInt(16) + 1;//Gera um numero aleatório que fara a escolha de times ser aleatoria
            if (rdmNum > 0 && rdmNum < 5 && i1 == false) {//Compara o numero aleatorio e a variavel boolean
                ordemDosAdversarios.add(times.get(0));//Adiciona o time na ArrayList
                i1 = true;//Da o valor verdadeiro para não entrar poder entrar mais na variavel
            } else if (rdmNum > 4 && rdmNum < 9 && i2 == false) {
                ordemDosAdversarios.add(times.get(1));
                i2 = true;
            } else if (rdmNum > 8 && rdmNum < 13 && i3 == false) {
                ordemDosAdversarios.add(times.get(2));
                i3 = true;
            } else if (rdmNum > 12 && rdmNum < 17 && i4 == false) {
                ordemDosAdversarios.add(times.get(3));
                i4 = true;
            }
            if (i1 == true && i2 == true && i3 == true && i4 == true) {
                continuarloop = false;
            }
            //System.out.println(ordemDosAdversarios);
        }
        //System.out.println(times.toString());
        //System.out.println(ordemDosAdversarios.toString());
    }//Fim Do Metodo

    private void addTimesDaCasa() {//Checa c o campo adicionado ja esta adicionado a um objeto Time
        for (int i = 0; i < 4; i++) {
            if (times.get(i).getCampo() == campoDoJogo) {
                timesDaCasa.add(times.get(i));
                timesDeFora.add(null);
                //System.out.println(timesDaCasa.get(i).getNomeEquipe());
            } else {
                timesDeFora.add(times.get(i));
                timesDaCasa.add(null);
                //System.out.println(timesDeFora.get(i).getNomeEquipe());
            }
        }
    }

    private void mediaTemperatura() {//Método que ira fazer a media e pegara a maior temperatura
        double k = 0;//Variavel que ficara armazenado a media da temperatura
        for (int i = 0; i < temperatura.getTemperatura().size(); i++) {//For que procura a maior temperatura e
            double j = (double) temperatura.getTemperatura().get(i);   //faz a soma de todas temperaturas
            k += (double) temperatura.getTemperatura().get(i);

            if (maiorTemperatura < j) {
                maiorTemperatura = j;
            }

        }
        k = k / temperatura.getTemperatura().size();//Media

        System.out.println("\nMaior temperatura: " + maiorTemperatura//Printa as variaveis
                + "\nMedia Temperatura: " + k);
    }//Fim do metodo
}
