//Escreva um programa que leia um número qualquer e mostre a tabuada desse
//número, usando a estrutura “para”.
//Ex: Digite um valor: 5
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15 ...

package desafio;
import java.util.Scanner;

public class exe66 {
    
    public static void quest66() {
        Scanner entrada = new Scanner(System.in);
        int num; int soma = 0; int res;
        
        System.out.print("DIGIITE UM NUMERO: ");
        num = entrada.nextInt();
        
        do {
            res = num * soma;
            System.out.printf("%d * %d = %d\n", num, soma, res);
            soma++;
            
        } while (soma <= 10); {
            System.out.print("Parou");
        }
        
        entrada.close();
    }
    
    public static void main(String[] args) {
        quest66();
    }
}