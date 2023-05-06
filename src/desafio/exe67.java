//Faça um programa usando a estrutura “para” que leia um número inteiro
//positivo e mostre na tela uma contagem de 0 até o valor digitado:
//Ex: Digite um valor: 9
//Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!

package desafio;
import java.util.Scanner;
public class exe67 {
    
    public static void quest68() {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        
        System.out.print("DIGITE UM NÚMERO POSITIVO: ");
        num = entrada.nextInt();
        
        for (int i = 0; i <= num; i++) {
            System.out.printf("NUMERO DA VEZ É: %d\n", i);
        }
        
        entrada.close();
    }
    
    public static void main(String[] args) {
        quest68();
        System.out.println("FIM");
    }
}