
package desafio;
import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();
        
        float res = nota1 + nota2;
        res /= 2;
        System.out.println("a média é: "+res); 
        entrada.close();
    }
}
