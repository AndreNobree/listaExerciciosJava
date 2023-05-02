// Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
// No final, mostre o total de salários pagos aos homens e o total pago às
// mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
// sempre que ler os dados de um funcionário.

package desafio;
import java.util.Scanner;
public class exe57 {
    //PRINCIPAL
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, totalSalariosHomens = 0, totalSalariosMulheres = 0;
        char sexo;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o salário do funcionário: ");
            salario = entrada.nextDouble();
            System.out.print("Digite o sexo do funcionário (M/F): ");
            sexo = entrada.next().toUpperCase().charAt(0); //VAI RETORNAR A PRIMEIRA LETRA RETORNADA

            if (sexo == 'M') {
                totalSalariosHomens += salario;
            } else if (sexo == 'F') {
                totalSalariosMulheres += salario;
            }

            System.out.print("Deseja continuar? (S/N): ");
            char opcao = entrada.next().charAt(0);
            if (opcao == 'N' || opcao == 'n') {
                continuar = false;
            }
        }

        System.out.println("Total de salários pagos aos homens: R$ " + totalSalariosHomens);
        System.out.println("Total de salários pagos às mulheres: R$ " + totalSalariosMulheres);

        entrada.close();
    }
}
