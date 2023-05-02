// Faça um programa que leia 7 números inteiros e no final mostre o somatório
// entre eles.

package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class exe48 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        List<Integer> numeros = new ArrayList<>();
        int soma = 0;

        for (int vez = 0; vez <= 7; vez++){ 
            if (vez == 0){vez = 1;}
            System.out.print("ENTRE COM O "+vez+"° NUMERO: ");
            int nums = entrada.nextInt();
            numeros.add(nums);
        }

        for (int resultado : numeros) {
            soma += resultado;
        }
        System.out.println(soma);
        
        
        entrada.close();
    }
}
