// Crie um programa que leia o preço de um produto, calcule e mostre o seu
// PREÇO PROMOCIONAL, com 5% de desconto.


package desafio;
import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE O PREÇO DO PRODUTO: ");
        double preco = entrada.nextDouble();

        double desconto = preco * 0.05;
        double total = preco - desconto;

        System.out.println("O PREÇO TOTAL É: "+total);

        entrada.close();
        
    }
}
