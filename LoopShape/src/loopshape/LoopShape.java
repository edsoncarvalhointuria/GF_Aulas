package loopshape;

public class LoopShape {

    static void createRectangle(int largura, int altura) {
        //Draw a Rectangle
        //int i = 0;
        String larguraStr = "#";//variavel que fara a largura do desenho
        String alturaStr = "#";//variavel que a altura

        if (largura < 1 || altura < 1) {// se a altura ou a largura menor que um
            System.out.println("Numero invalido favor muda-lo");//imprimir isso
        } else if (largura == 1 && altura == 1) {// se elas forem iguam a 1
            System.out.println("#");//imprimir apenas um simbolo
        } else {
            while (larguraStr.length() < largura) {//se o numero de letras da variavel for menor que a largura 
                larguraStr += "#";//adicionar um simbolo a cada volta
            }
            System.out.println(larguraStr);
            while (alturaStr.length() < largura - 1) {// cada volta do while adiciona um espaço a variavel
                alturaStr += " ";
            }
            alturaStr += "#";//adiciona um simbolo por ultimo
            for (int i = 1; i < altura - 1; i++) {//se o i for menor que a altura menos 1
                System.out.println(alturaStr);//printa a variavel
            }

            System.out.println(larguraStr);// printar por ultimo

            System.out.println("");// um espaço para não se juntar com outro desenho 
        }

    }

    static void createTriangle(int tamanho) {
        //Draw an Isosceles Right Triangle
        String tamanhoStr = "#";
        String larguraStr = "#";

        if (tamanho == 1) {
            System.out.println("#");
        } else {
            while (tamanhoStr.length() < tamanho) {//cada volta do while adicionar um simbolo
                tamanhoStr += "#";
            }

            System.out.println("#");//imprimir o topo do desenho
            while (larguraStr.length() < tamanho - 1) {
                System.out.println(larguraStr + "#");//imprimir a variavel com um a mais simbolo no final
                larguraStr += " ";//adicionar um espaço a cada volta
                //System.out.print("#");
            }
            
            System.out.println(tamanhoStr);//printar a largura
            
            System.out.println("");// espaço para não juntar com outro desenho
        }
        /*larguraStr += "#";
        System.out.println("#");
        int i = larguraStr.length();
        while (i <= larguraStr.length()) {
            larguraStr = larguraStr.replaceFirst(" ", "");
            System.out.println(larguraStr);
            i--;
            if (i == 2) {
                i = tamanho + 1;
            }
        }*/
    }
}
