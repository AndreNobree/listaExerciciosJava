// Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
// 450 + 400 + 350 + 300 + ... + 50 + 0

package desafio;
import java.util.ArrayList;
import java.util.List;

public class exe47 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        int soma = 0;
        //ADICIONA A LISTA OS NÚMEROS DESEJADOS
        for (int num = 450; num >= 0; num--){
            if ( num % 50 == 0 ){
                numeros.add(num);
            }
        }
        //SOMA TODOS OS NUMEROS DA LISTA
        System.out.println(numeros);
        for (int resultado : numeros) {
            soma += resultado;
        }
        System.out.println(soma);
    }
}
