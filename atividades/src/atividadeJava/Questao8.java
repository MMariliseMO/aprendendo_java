//8º) Adotando como referência o exercício 7, calcule e exiba a intensidade da corrente elétrica (A) a partir da tensão (V) e resistência (R) que o usuário irá fornecer ao programa.

package atividadeJava;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o valor da tensão aplicada(V): ");
        double tensao = entrada.nextDouble();

        System.out.println("Digite o valor da resistência(R): ");
        double resistencia = entrada.nextDouble();

        entrada.close();

        //fórmula: A = V/R
        double corrente = tensao / resistencia;

        System.out.printf("O valor da Intensidade da corrente elétrica(A) é de: %.1fA\n", corrente);
    }   
}
