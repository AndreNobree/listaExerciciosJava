// Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
// no final:
// a) Qual foi a média de altura do grupo
// b) Quantas pessoas pesam mais de 90Kg
// c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
// d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.

package desafio;
import java.util.Scanner;


public class exe54 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
       
        //VARIAVEIS
        Double peso = 0.0; Double altura = 0.0; int media = 0;
        int maisNovenP = 0; int maisNovenA = 0; int menosSesA = 0;

        for (int i = 0; i < 7; i++){
            System.out.print("DIGITE O PESO: ");
            peso = entrada.nextDouble();

            if (peso > 90){
                maisNovenP++;

                System.out.print("DIGITE A ALTURA: ");
                altura = entrada.nextDouble();
                

                if (peso > 100 && altura > 1.90){
                    maisNovenA++;
                }

            }else if (peso < 50){
                
                System.out.print("DIGITE A ALTURA: ");
                altura = entrada.nextDouble();
                

                if (altura < 1.60){
                    menosSesA++;
                }
            }else{
                System.out.print("DIGITE A ALTURA: ");
                altura = entrada.nextDouble();
                
            }         
        }
        media = maisNovenA + menosSesA;
        media /= 2;
        System.out.println(media);
        System.out.printf("%d pessoas acima de 90Kg\n%d pessoas pesam menos de 50Kg e tem menos de 1.60m\n%d pessoas medem mais que 1.90m e pesam mais de 100Kg\na media de alturas é: %d ", maisNovenP, menosSesA, maisNovenA, media);
        entrada.close();
    }
}
