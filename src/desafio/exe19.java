// Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
// média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
// não um bom aproveitamento (se ficou acima da média 7.0).

package desafio;
import java.util.Scanner;

public class exe19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("DIGITE O NOME DO ALUNO: ");
        String nome = entrada.nextLine();

        System.out.print("DIGITE A PRIMEIRA NOTA DE "+nome+": ");
        Double nota1 = entrada.nextDouble();
        System.out.print("DIGITE A SEGUNDA NOTA DE "+nome+": ");
        Double nota2 = entrada.nextDouble();

        Double total = nota1 + nota2;
        total /= 2;
        System.out.println("A MÉDIA DE "+nome+" é "+total); 
        

        entrada.close();
    }    
}
