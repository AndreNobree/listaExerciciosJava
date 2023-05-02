// [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
// fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
// já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
// quantos dias de vida um fumante perderá e exiba o total em dias.

package desafio;
import java.util.Scanner;

public class exe16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade de cigarros fumados por dia: ");
        int qtdCigarrosPorDia = entrada.nextInt();

        System.out.print("Informe a quantidade de anos que você fuma: ");
        int qtdAnosFumante = entrada.nextInt();

        int qtdCigarrosFumados = qtdCigarrosPorDia * (365 * qtdAnosFumante);
        int tempoPerdido = qtdCigarrosFumados * 10; // cada cigarro perdemos 10 min de vida
        int diasPerdidos = tempoPerdido / 1440; // 1440 é o número de minutos em um dia

        System.out.println("Você perdeu aproximadamente " + diasPerdidos + " dias de vida fumando.");
        entrada.close();
    }
}
