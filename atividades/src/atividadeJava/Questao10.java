//10º) Considerando o exercício 9, calcule e exiba a corrente (A) que circula por determinado aparelho eletrônico a partir da potência (P) e tensão (V) digitadas pelo usuário.

package atividadeJava;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);
        

        System.out.println("Digite o valor da potência(P): ");
        double potencia = entrada.nextDouble();

        System.out.println("Digite o valor da tensão(V): ");
        double tensao = entrada.nextDouble();

        entrada.close();

        //fórmula: A = P * V
        double corrente = potencia / tensao;

        System.out.printf("O valor da corrente(A) que circula o aparelho eletrônico é de: %.1fA\n", corrente);
    }    
}
