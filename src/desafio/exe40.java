// Crie um aplicativo que mostre na tela a seguinte contagem:
// 0 3 6 9 12 15 18 Acabou!

package desafio;

public class exe40 {
    public static void main(String[] args) {
        
        for (int cont = 0; cont <= 18; cont++){
            if (cont % 3 == 0){
                System.out.println(cont);
            }
        }
        System.out.println("ACABOU ");

    }    
}
