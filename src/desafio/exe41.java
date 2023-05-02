// Desenvolva um programa que mostre na tela a seguinte contagem:
// 100 95 90 85 80 ... 0 Acabou!

package desafio;

public class exe41 {
    public static void main(String[] args) {
        for (int cont = 100; cont > -1; cont--){
            if (cont % 5 == 0){
                System.out.println(cont);
            }
            
        }
        System.out.println("ACABOU");
    }
}
