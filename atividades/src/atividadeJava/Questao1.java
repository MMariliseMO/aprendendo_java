//1º) Criar uma aplicação que receba por digitação o nome e o sobrenome e, em seguida, realize a exibição da seguinte maneira: sobrenome, nome.

package atividadeJava; //pacote em que o arquivo java está localizado 

import java.util.Scanner; //importar a classe Scanner, pois é ela que serve para ler a entrada dos usuários

public class Questao1 { //classe pública. Em java o nome da classe é o mesmo nome do arquivo
    public static void main(String[] args){ // "main" é o método principal
        Scanner entrada = new Scanner(System.in); // objeto scanner que será usado para entrada dos usuários

        
        System.out.println("Digite seu nome: "); 
        String nome = entrada.nextLine(); // ler a entrada digitada pelo usuário

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        entrada.close(); //fecha a entrada Scanner

        System.out.println( sobrenome + ", " + nome);
    }
}