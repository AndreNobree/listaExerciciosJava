package desafio;
import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
        
    System.out.print("Digite seu nome: ");
    String nome = entrada.nextLine();
    System.out.print("Digite seu idade: ");
    float salario = entrada.nextFloat();

    System.out.println("O funcionário(a) "+ nome +" tem um salário de "+salario+" em Junho.");

    entrada.close();
    }
}

