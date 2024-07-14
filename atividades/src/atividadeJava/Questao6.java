//6º) Calcular a média final de um aluno, considerando que o mesmo irá realizar duas provas (P1 e P2), visto que a P1 deverá ter peso 4 e a P2 peso 6. Adotar que as notas são do tipo de dado real e que elas serão fornecidas pelo usuário. (Média ponderada)

package atividadeJava;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        System.out.println("Digite a 1º Nota: ");
        double primeiraNota = entrada.nextDouble();

        System.out.println("Digite a 2º Nota: ");
        double segundaNota = entrada.nextDouble();

        entrada.close();

        double media = (primeiraNota * 4 + segundaNota * 6) / 10; // os pesos das médias precisam ser levados em condideração, pois estou calculando a média ponderada

        System.out.printf("A média do aluno(a) é: %.1f\n", media);
    }
}
