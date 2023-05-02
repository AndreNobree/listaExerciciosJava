package desafio;
import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = entrada.nextLine();

    System.out.println("Olá "+nome+", é um prazer te conhecer");

    entrada.close();
    }
}
