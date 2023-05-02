// Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
// qual foi o maior e qual foi o menor preço digitados.

package desafio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class exe51 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        for (int i = 0; i < 7; i++){
            System.out.print("DIGITE O PREÇO DO "+i+"° PRODUTOs: ");
            double precos = entrada.nextDouble();
            numeros.add(precos);
        }

        //pega o menor valor possivel de um numero
        Double vari = Double.MIN_VALUE;
        for (int i = 0; i < numeros.size(); i++) {
            // ve se o numero da lista é maior que a variavel "vari"
            if (numeros.get(i) > vari) {
                //se verdadeiro, ele reatribui o valor de "vari" pelo o numero que foi comparado
                vari = numeros.get(i);
            }
        }
        System.out.println("O maior valor da lista é: " + vari);
        
        entrada.close();
    }
}
