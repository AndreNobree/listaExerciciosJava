// Escreva um programa para aprovar ou não o empréstimo bancário para a compra
// de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
// em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
// ela não pode exceder 30% do salário ou então o empréstimo será negado.

package desafio;
import java.util.Scanner;
public class exe33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("DIGITE O VALOR DA CASA: ");
        double valorCasa = entrada.nextDouble();
        System.out.print("DIGITE A RENDA MENSAL DO COMPRADOR: ");
        double salario = entrada.nextDouble();
        System.out.print("DIGITE A QUANTIDADE DE ANOS QUE DESEJA PAGAR A CASA: ");
        int anos = entrada.nextInt();

        valorCasa /= anos;
        valorCasa /= 12;
        System.out.println("R$"+valorCasa+" PARCELAS MENSAIS");

        salario *= 0.30;
        
        if (valorCasa > salario){
            System.out.println("EMPRESTIMO NEGADO!! PARCELAS MENSAIS ACIMA DE 30% DO SALÁRIO!!!");
        }else{
            System.out.println("EMPRÉSTIMO APROVADO!!!!");
        }
        
        entrada.close();
    }
}
