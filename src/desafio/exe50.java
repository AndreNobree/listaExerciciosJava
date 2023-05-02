// Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
// mostre na tela:
// a) Quais foram os números sorteados
// b) Quantos números estão acima de 5
// c) Quantos números são divisíveis por 3

package desafio;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class exe50 {
    public static void main(String[] args) {

        Random random = new Random();
        int conta = 0;
        List<Integer> numeros = new ArrayList<>();
//A
        for (int i = 0; i <= 19; i++){
            int rand = random.nextInt(10);
            numeros.add(rand);
        }
        System.out.println(numeros+"\n");
//B
        for ( int res : numeros ){
            if (res > 5){
                System.out.print(res+ " ");
                conta++;
            }
        }
        System.out.println("\n"+conta+" numeros");
        
//C
        System.out.println("\n");
        for ( int res2 : numeros ){
            if (res2 % 3 == 0){
                System.out.print(res2+ " ");
            }
        }
            
    }
}
