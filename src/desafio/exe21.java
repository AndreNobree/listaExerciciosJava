// Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
// BISSEXTO.

package desafio;
import java.util.Scanner;

public class exe21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o ano em questão: ");
        int ano = entrada.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println(ano+" É UM ANO BISSEXTO");
        }
        else{
            System.out.println(ano+" NÃO É UM ANO BISSEXTO");
        }

        
        entrada.close();
    }
}
