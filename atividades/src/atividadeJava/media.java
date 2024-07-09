//4º) Criar uma aplicação que receba três números reais digitados pelo usuário e, após, calcule e exiba o valor da média

package atividadeJava;

import java.util.Scanner;

public class media {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o 2º número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite o 3º número: ");
        double num3 = entrada.nextDouble();

        entrada.close();

        double media = (num1 + num2 + num3)/3;

        System.out.printf("A média é: %.1f\n", media); //o printf é usado para formatar a saída de um dado de maneira específica, como limitar o número de casas decimais. Os argumentos são separados por vírgulas
        
    }    
}
