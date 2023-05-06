//Desenvolva um programa usando a estrutura “para” que mostre na tela a
//seguinte contagem:
//100 90 80 70 60 50 40 30 20 10 0 Acabou!

package desafio;

public class exe65 {
    
    public static void quest() {
        int i = 100;
        
        do {
            System.out.println("O NUMERO DA VEZ É: "+i);
            i -= 10;
        } while (i >= 0); {
            System.out.println("ACABOU!!");
        }
        
    }
    
    public static void main(String[] args) {
        quest();
    }
}