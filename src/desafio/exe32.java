// Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
// jogador vai tentar descobrir qual foi o valor sorteado.

package desafio;
import java.util.Scanner;
import java.util.Random;
public class exe32 {
    public static void main(String[] args) {
        executa();
    }
    public static void executa(){
        Scanner entrada = new Scanner(System.in);

        Random random = new Random();
        int rand = random.nextInt(5);
        if ( rand == 0 ) { rand = 5; }

        System.out.print("DIGITE UM NUMERO ENTRE 1 - 5: ");
        int acerto = entrada.nextInt();
        
        if ( acerto == rand ) { System.out.println("VOCÊ ACERTOU"); executa(); }
        else { System.out.println("VOCÊ ERROU, O NÚMERO SORTEADO FOI: "+ rand); executa(); }

        entrada.close();
    }
}
