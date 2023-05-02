// Crie um programa que leia duas notas de um aluno e calcule a sua média,
// mostrando uma mensagem no final, de acordo com a média atingida:
//  - Média até 4.9: REPROVADO
//  - Média entre 5.0 e 6.9: RECUPERAÇÃO
//  - Média 7.0 ou superior: APROVADO

package desafio;
import java.util.Scanner;
public class exe27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE A PRIMEIRA NOTA: ");
        Double nota1 = entrada.nextDouble();
        System.out.print("DIGITE A SEGUNDA NOTA: ");
        Double nota2 = entrada.nextDouble();

        Double resultado = nota1 + nota2;
        resultado /= 2;
        if (resultado > 6.9){
            System.out.println("ALUNO APROVADO!!! MÉDIA: "+resultado);
        }else if (resultado > 3.9){
            System.out.println("ALUNO DE RECUPERAÇÃO!!! MÉDIA: "+resultado);
        }else{
            System.out.println("ALUNO REPROVADO!!! MÉDIA: "+resultado);
        }

        entrada.close();
    }
}
