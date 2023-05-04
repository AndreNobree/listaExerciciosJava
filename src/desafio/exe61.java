//Crie um programa que mostre na tela a seguinte contagem, usando a estrutura
//“faça enquanto”
//0 3 6 9 12 15 18 21 24 27 30 Acabou!

package desafio;

public class exe61 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i + " ");
            i += 3;
        } while (i <= 30);
        System.out.println("Acabou!");
    }
}
