// Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
// situação em relação ao alistamento militar.
//  - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
// alistamento.
//  - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
// alistamento.

package desafio;
import java.util.Scanner;

public class exe22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano em que estamos: ");
        int anoAgora = entrada.nextInt();
        System.out.print("Digite o ano em que você nasceu: ");
        int ano = entrada.nextInt();

        anoAgora -= ano;
        

        if (anoAgora > 18){
            anoAgora -= 18;
            System.out.println("você deve se alistar ja se passaram "+anoAgora+" anos");
        }else {
            System.out.println("faltam "+anoAgora+" anos para se alistar");
        }

        entrada.close();
    }
}
