// Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
// seu novo salário, com 15% de aumento.

package desafio;
import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("INFORME O SALARIO: ");
        double salario = entrada.nextDouble();

        double aumento = salario * 1.15;
        

        System.out.println("O SALARIO COM AUMENTO DE 15% É: "+aumento);


        entrada.close();
    }
}
