package desafio;
import java.util.Scanner;

public class exe09 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite em reais o salário que você ganha: ");
        float salario = entrada.nextFloat();

        salario *= 3.45;

        System.out.println("Transformando em dólar você tem "+salario);

        entrada.close();
    }
}
