//Desenvolva um programa usando a estrutura “para” que mostre na tela a
//seguinte contagem:
//0 5 10 15 20 25 30 35 40 Acabou!

package desafio;

public class exe64 {
    //variavel global
    public static int i = 0;
    
    public static void teste() {
        do {
            System.out.println("o numero da vez é: "+i);
            i += 5;
            
        } while (i <=40 ); {
            System.out.println("ACABOU!!");
        }
        
        
    }
    
    public static void main(String[] args) {
        teste();
    }
}