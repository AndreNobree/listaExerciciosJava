// Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
// dela e depois mostre se ela pode ou não votar.

package desafio;
import java.util.Scanner;
public class exe18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu: ");
        int ano = entrada.nextInt();

        int resto = 2023 - ano;
        System.out.println("Você tem aproximadamente "+resto+" anos");
        if (resto > 70 || resto < 18){
            System.out.println("Está livre, não precisa votar !!!!");
        }else{
            int falta = 70 - resto;
            System.out.println("Você ainda precisa votar, faltam "+falta+" anos para parar de votar!!");
        }

        entrada.close();
    }
}
