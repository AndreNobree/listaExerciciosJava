package desafio;
import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int numero = entrada.nextInt();
    
    int antecessor = numero;
    antecessor -= 1;

    System.out.println("o numero q vc escolheu foi: "+numero+", e seu antecessor é: "+antecessor);

    entrada.close();
    }
}
