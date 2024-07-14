//5º) Uma determinada loja precisa calcular o preço de venda de um produto. O cálculo deverá ser efetuado pela multiplicação do preço unitário pela quantidade vendida e, posteriormente, subtrair o valor do desconto. Considerar todas as variáveis do tipo de dado real e que estas serão digitadas pelo usuário

package atividadeJava;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] arg){
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Digite o preço do produto: ");
        double precoProduto = entrada.nextDouble();

        System.out.println("Quantidades vendidas: ");
        double quantVendidas = entrada.nextDouble();

        System.out.println("Valor do desconto: ");
        double desconto = entrada.nextDouble();

        entrada.close();

        double precoDeVenda = (precoProduto * quantVendidas) - (desconto);

        System.out.printf("O preço de venda é de: %.1f\n", precoDeVenda);
    }  
} 
