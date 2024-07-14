//7º) A lei de Ohm define que a resistência (R) de um condutor é obtida pela divisão da tensão aplicada (V) dividida pela intensidade da corrente elétrica (A). Dessa forma, a partir de uma tensão e corrente, digitadas pelo usuário, calcule e mostre o valor da resistência.

package atividadeJava;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite o valor da tensão aplicada(V): ");
        double tensao = entrada.nextDouble();

        System.out.println("Digite o valor da intensidade da corrente elétrica(A): ");
        double corrente = entrada.nextDouble();

        entrada.close();

        //fórmula: R = V/A
        double resistencia = (tensao) / corrente;
        
        System.out.printf("O valor da resistência(R) é de: %.1fohms\n", resistencia);

    }   
}

