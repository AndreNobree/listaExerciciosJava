// Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
// para todos, mas especialmente para mulheres. Faça um programa que leia nome,
// sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
// que:
//  - Homens ganham 5% de desconto
//  - Mulheres ganham 13% de desconto

package desafio;
import java.util.Scanner;

public class exe23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sexo(M/F): ");
        String sexo = entrada.nextLine().toUpperCase();

        System.out.print("Digite o valor da compra: ");
        Double compra = entrada.nextDouble();

        if (sexo.equals("F")){
            Double resultado = compra * 0.13;
            compra -= resultado;
            System.out.println(nome+" O VALOR TOTAL COM 13% DE DESCONTO É: "+compra);
        }else if (sexo.equals("M")){
            Double resultado = compra * 0.05;
            compra -= resultado;
            System.out.println(nome+" O VALOR TOTAL COM 5% DE DESCONTO É: "+compra);
        }

        entrada.close();
    }
}
