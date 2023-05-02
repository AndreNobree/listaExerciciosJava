// A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
// um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
// quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
// sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

package desafio;
import java.util.Scanner;


public class exe14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("INFORME A QUANTIDADE DE KM PERCORRIDA: ");
        double percorrido = entrada.nextDouble();
        System.out.print("INFORME A QUANTIDADE DE DIAS: ");
        int dias = entrada.nextInt();

        int carro = 90;
        double dinkm = 0.20;

        float por_dia = carro * dias;
        double por_percorrido = percorrido * dinkm ;
        double total = por_dia + por_percorrido;

        System.out.println("VOCÊ DEVE PAGAR "+total);


        entrada.close();
    }
}
