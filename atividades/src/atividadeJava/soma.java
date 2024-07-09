//3º) Escrever uma aplicação que receba quatro números inteiros digitados pelo usuário e, posteriormente, calcule e exiba o valor da soma desses números

package atividadeJava;

import java.util.Scanner;

public class soma {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o 2º número: ");
        int num2 = entrada.nextInt();

        System.out.println("Digite o 3º número: ");
        int num3 = entrada.nextInt();

        System.out.println("Digite o 4º número: ");
        int num4 = entrada.nextInt();

        entrada.close();

        int soma = num1 + num2 + num3 + num4;

        System.out.println("O resultado da soma é: " + soma);
    }
    
}
