// Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
// vai parar quando for digitada a idade 999. No final, mostre quantos alunos
// existem na turma e qual é a média de idade do grupo.

package desafio;
import java.util.Scanner;
public class exe58 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //VARIAVEIS int
        int idade = 0; int totalAlunos = 0; int somaIdades = 0;
        //VARIAVEIS boolean
        boolean continuar = true;
        //VARIAVEIS Double
        // Double media = 0.0;

        while (continuar){
            System.out.println("DIGITE SUA IDADE: ");
            idade = entrada.nextInt();
            if (idade == 999){
                break;
            }else{
                somaIdades += idade;
                totalAlunos ++;
            }
        }
        somaIdades /= totalAlunos;
        System.out.printf("EXISTEM %d NA TURMA\nA MÉDIA É: %d", totalAlunos, somaIdades);

        entrada.close();
    }
}
