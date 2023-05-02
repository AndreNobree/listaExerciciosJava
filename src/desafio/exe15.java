// Crie um programa que leia o número de dias trabalhados em um mês e mostre o
// salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
// por hora trabalhada.

package desafio;
import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("DIGITE O NUMERO DE DIAS TRABALHADOS: "); 
        int dias = entrada.nextInt();
        System.out.print("DIGITE O SALÁRIO DO EMPREGADO: "); 
        float salario = entrada.nextFloat();

        int horas = 8;
        float total1 = 25 * horas;
        float total2 = total1 * dias;
        total2 += salario;

        System.out.println("O TOTAL QUE O EMPREGADO IRÁ RECEBER É: "+ total2);

        entrada.close();
        
    }
}
