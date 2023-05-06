//Faça um programa que mostre os 10 primeiros elementos da Sequência
//de Fibonacci:
//1 1 2 3 5 8 13 21...

package desafio;

public class exe70 {
    public static void main(String[] args) {
        int elementoUm = 1, elementoSeguinte = 1, outro = 0;
        
        System.out.print("1");
        
        for (int i = 0; i < 10; i++) {
            
            System.out.printf(" %d",  elementoSeguinte);
            
            outro = elementoUm;
            elementoUm = elementoSeguinte;
            elementoSeguinte += outro;
            
        }
    }
}