// Faça um programa que preencha automaticamente um vetor numérico com 8
// posições, conforme abaixo:
// 999 999 999 999 999 999 999 999
//  0   1   2   3   4   5   6   7

package desafio;

public class exe71 {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        
        // preenche o vetor com o valor 999 em todas as posições
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 999;
        }
        
        // exibe o vetor com a posição de cada elemento
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " " + i);
        }
    }
}