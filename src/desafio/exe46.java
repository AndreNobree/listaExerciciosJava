// Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
// 8 + 10 + 12 + 14 + ... + 98 + 100.

package desafio;
import java.util.ArrayList;
import java.util.List;

public class exe46 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        int soma = 0;
        //ADICIONA A LISTA OS NÚMEROS DESEJADOS
        for (int num = 6; num <= 100; num++){
            if ( num % 2 == 0 ){
                numeros.add(num);
            }
        }
        //SOMA TODOS OS NUMEROS DA LISTA
        for (int resultado : numeros) {
            soma += resultado;
        }
        System.out.println(soma);
    }
}



