// [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
// Analise seus comprimentos e diga se é possível formar um triângulo com essas
// retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
// de cada lado deve ser menor que a soma dos outros dois.

package desafio;
import java.util.Scanner;

public class exe25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("INFORME O PRIMEIRO SEGMENTO: ");
        int seg1 = entrada.nextInt();
        System.out.print("INFORME O SEGUNDO SEGMENTO: ");
        int seg2 = entrada.nextInt();
        System.out.print("INFORME O TERCEIRO SEGMENTO: ");
        int seg3 = entrada.nextInt();

        if (seg1 < seg2 + seg3 && seg2 < seg1 + seg3 && seg3 < seg1 + seg2) {
            System.out.println("É possível formar um triângulo com essas retas.");
        } else {
            System.out.println("Não é possível formar um triângulo com essas retas.");
        }
        
        entrada.close();
    }
}
