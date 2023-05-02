// Vamos melhorar o jogo que fizemos no exercício 32. A partir de
// agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
// tentativas para tentar acertar.

package desafio;
import java.util.Scanner;
import java.util.Random;

public class exe55 {
    public static void main(String[] args) {
        executa();
    }
    public static void executa(){
        Scanner entrada = new Scanner(System.in);

        Random random = new Random();
        int rand = random.nextInt(10);
        if ( rand == 0 ) { rand = 10; }

        for (int i = 0; i < 4; i++){
            System.out.print("DIGITE UM NUMERO ENTRE 1 - 10: ");
            int acerto = entrada.nextInt();

        
            if ( acerto == rand ) { System.out.println("VOCÊ ACERTOU"); break; }

            else { System.out.println("VOCÊ ERRO!!!"); }
           
        }

        

        entrada.close();
    }
}
