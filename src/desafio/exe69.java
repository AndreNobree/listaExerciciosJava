//Desenvolva um programa que leia o primeiro termo e a razão de uma
//PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
//a soma entre todos os valores da sequência.

package desafio;
import java.util.Scanner;

public class exe69 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro termo da PA: ");
        int primeiroTermo = entrada.nextInt();

        System.out.print("Digite a razão da PA: ");
        int razao = entrada.nextInt();

        double soma = 0;
        for (int i = 0; i < 10; i++) {
            int elemento = primeiroTermo + i * razao;
            System.out.printf("%d ", elemento);
            soma += elemento;
        }

        System.out.printf("\nSoma dos valores da PA: %d", soma);
        entrada.close();
    }
}