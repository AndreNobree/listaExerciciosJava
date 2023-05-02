// Uma empresa precisa reajustar o salário dos seus funcionários, dando um
// aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
// o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
// No final, mostre o seu novo salário, baseado na tabela a seguir:
// - Mulheres
// - menos de 15 anos de empresa: +5%
// - de 15 até 20 anos de empresa: +12%
// - mais de 20 anos de empresa: +23%
// - Homens
// - menos de 20 anos de empresa: +3%
// - de 20 até 30 anos de empresa: +13%
// - mais de 30 anos de empresa: +25%

package desafio;
import java.util.Scanner;

public class exe37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o salário atual: ");
        double salario = entrada.nextDouble();
        
        System.out.print("Informe o gênero do funcionário (M ou F): ");
        String genero = entrada.next();
        
        System.out.print("Informe há quantos anos o funcionário trabalha na empresa: ");
        int anosEmpresa = entrada.nextInt();
        
        double aumento = 0;
        
        if (genero.equalsIgnoreCase("F")) {
            if (anosEmpresa < 15) {
                aumento = salario * 0.05;
            } else if (anosEmpresa >= 15 && anosEmpresa <= 20) {
                aumento = salario * 0.12;
            } else {
                aumento = salario * 0.23;
            }
        } else if (genero.equalsIgnoreCase("M")) {
            if (anosEmpresa < 20) {
                aumento = salario * 0.03;
            } else if (anosEmpresa >= 20 && anosEmpresa <= 30) {
                aumento = salario * 0.13;
            } else {
                aumento = salario * 0.25;
            }
        }
        
        double novoSalario = salario + aumento;
        
        System.out.println("O novo salário do funcionário é: " + novoSalario);
        
        entrada.close();
    }
}
