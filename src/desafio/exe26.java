// Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
// na tela uma das mensagens abaixo:
//  - O primeiro valor é o maior
//  - O segundo valor é o maior
//  - Não existe valor maior, os dois são iguais

package desafio;
import java.util.Scanner;


public class exe26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("DIGITE O PRIMEIRO NUMERO: ");
        int num1 = entrada.nextInt();
        System.out.print("DIGITE O PRIMEIRO NUMERO: ");
        int num2 = entrada.nextInt();
        
        if (num1 == num2){
            System.out.println("Não existe valor maior, os dois são iguais");
        }else if (num1 > num2){
            System.out.println("O primeiro valor é o maior");
        }else if (num2 > num1){
            System.out.println("O segundo valor é o maior");
        }


        entrada.close();
    }
}
