// Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
// ÍMPAR.

package desafio;
import java.util.Scanner;
public class exe20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();

        if (num % 2 == 0){
            System.out.println("O NÚMERO "+ num+" É PAR");
        }else{
            System.out.println("O NÚMERO "+ num+" É IMPAR");
        }

        entrada.close();
    }
}
