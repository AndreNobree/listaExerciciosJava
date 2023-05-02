import java.util.Scanner;

public class console {
    public static void main(String[] args) {
        System.out.println("Teste");

        Scanner entrada = new Scanner(System.in); // permitir a entrada do usuario

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine(); // nextLine - recebe uma string

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idaide: ");
        int idade = entrada.nextInt();// nextInt - recebe uma numero inteiro

        
        entrada.close();// fechar a entrada
        

        System.out.println("\n O nome digitado foi: " + nome + ", sobrenome: "+sobrenome+ ", idade: "+idade);

    }
}
