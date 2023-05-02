// Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
// qualquer e mostre uma contagem até esse valor:
// Ex: Digite um valor: 35
// Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

package desafio;
import java.util.Scanner;
public class exe42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE UM NUMERO: ");
        int numero = entrada.nextInt();

        for (int cont = 0; cont <= numero; cont++){
            System.out.println(cont);
        }

        System.out.println("ACABOU");

        entrada.close();
    }
}
