// Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
// a) Qual é a média de idade do grupo
// b) Quantas pessoas tem mais de 18 anos
// c) Quantas pessoas tem menos de 5 anos
// d) Qual foi a maior idade lida

package desafio;
import java.util.Scanner;

public class exe52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int idade, somaIdades = 0, qtdMaioresDezoito = 0, qtdMenoresCinco = 0, maiorIdade = 0;
        double mediaIdades;
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite a idade da pessoa %d: ", i);
            idade = input.nextInt();
            
            somaIdades += idade;
            
            if (idade > 18) {
                qtdMaioresDezoito++;
            }
            
            if (idade < 5) {
                qtdMenoresCinco++;
            }
            
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }
        
        mediaIdades = (double) somaIdades / 10;
        
        System.out.printf("A média de idade do grupo é: %.2f\n", mediaIdades);
        System.out.printf("%d pessoas têm mais de 18 anos.\n", qtdMaioresDezoito);
        System.out.printf("%d pessoas têm menos de 5 anos.\n", qtdMenoresCinco);
        System.out.printf("A maior idade lida é: %d\n", maiorIdade);
        
        input.close();
    }
}
