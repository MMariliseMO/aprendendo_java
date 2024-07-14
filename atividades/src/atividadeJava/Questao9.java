//9º) A potência (P) consumida por determinado aparelho eletrônico é a definida pela tensão (V) multiplicada pela corrente (A). Elaborar um programa que, a partir da tensão e corrente fornecidas pelo usuário, calcule e mostre na tela a potência.

package atividadeJava;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Digite o valor da tensão(V): ");
        double tensao = entrada.nextDouble();

        System.out.println("Digite o valor da corrente(A): ");
        double corrente = entrada.nextDouble();

        entrada.close();

        //fórmula: P = V * A
        double potencia = tensao * corrente;

        System.out.printf("O valor da potência(P) consumida pelo aparelho eletrônico é de: %.1fW\n", potencia);
    }
}
