//2º) Elaborar um programa que realize a multiplicação de dois valores numéricos do tipo de dado real digitados pelo usuário e, depois, exiba o valor calculado.

package atividadeJava;

import java.util.Scanner;

public class multiplicacao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1º valor: ");
        double valor1 = entrada.nextDouble(); //double é o método de entrada de dado do tipo real

        System.out.println("Digite o 2º valor: ");
        double valor2 = entrada.nextDouble();

        entrada.close();

        double resultado = valor1 * valor2;

        System.out.println("O resultado da multiplicação é: " + resultado);

    }
    
}
