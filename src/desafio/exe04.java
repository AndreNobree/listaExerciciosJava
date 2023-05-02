package desafio;
import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        float num1 = entrada.nextFloat();
        System.out.print("Digite outro numero: ");
        float num2 = entrada.nextFloat();
        
        float res = num1 + num2;
        System.out.println("resultado da soma entre os 2 numeros é "+res); 
        entrada.close();
    }
}
