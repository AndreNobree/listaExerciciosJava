// Crie um programa que leia 6 números inteiros e no final mostre quantos deles
// são pares e quantos são ímpares.

package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class exe49 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        List<Integer> numeros = new ArrayList<>();
        int somaPar = 0; int somaImpar = 0;

        for (int vez = 0; vez <= 6; vez++){ 
            if (vez == 0){vez = 1;}
            System.out.print("ENTRE COM O "+vez+"° NUMERO: ");
            int nums = entrada.nextInt();
            numeros.add(nums);
        }

        for (int resultado : numeros) {
            // soma += resultado;
            if (resultado % 2 == 0){
                System.out.println(resultado+" É PAR");
                somaPar += resultado;
            }else{
                System.out.println(resultado+" É ÍMPAR");
                somaImpar += resultado;
            }
        }
        System.out.println("PARES: "+somaPar+" | ÍMPARES: "+somaImpar);
        
        
        entrada.close();
    }
}
