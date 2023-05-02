// Desenvolva um programa que leia o nome de um funcionário, seu salário,
// quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
// acordo com a tabela a seguir:
//  - Até 3 anos de empresa: aumento de 3%
//  - entre 3 e 10 anos: aumento de 12.5%
//  - 10 anos ou mais: aumento de 20%

package desafio;
import java.util.Scanner;
public class exe29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE O NOME DO FUNCIONARIO: ");String nome = entrada.nextLine();
        System.out.print("DIGITE O SALÁRIO DO FUNCIONARIO: ");Double salario = entrada.nextDouble();
        System.out.print("DIGITE QUANTOS ANOS O FUNCIONARIO TRABALHA NA EMPRESA: ");int anos = entrada.nextInt();
    
        
        if ( anos <= 3 ){
            salario *=  1.03;
            System.out.println("O SALÁRIO DO FUNCIONARIO "+nome+" SOFREU UM AUMENTO DE 3%, TOTALIZANDO: R$"+salario);
        } else if (anos < 10){
            salario *=  1.125;
            System.out.println("O SALÁRIO DO FUNCIONARIO "+nome+" SOFREU UM AUMENTO DE 12.5%, TOTALIZANDO: R$"+salario);
        } else {
            salario *=  1.2;
            System.out.println("O SALÁRIO DO FUNCIONARIO "+nome+" SOFREU UM AUMENTO DE 12.5%, TOTALIZANDO: R$"+salario);
        }

        entrada.close();
    }
}
