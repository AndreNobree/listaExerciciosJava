// Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
// 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
// o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

package desafio;
import java.util.Scanner;

public class exe17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a velociade do carro: ");        
        int vel = entrada.nextInt();

        if (vel > 80){
            System.out.println("LIMITE DE VELOCIDADE VIOLADO VEL: "+vel+"km/h, PERMITIDO SOMENTE 80km/h");
            float resto = vel - 80;
            resto *= 5;
            System.out.println("VALOR DA MULTA A SER PAGA É R$"+resto);
        }else{
            System.out.println("DENTRO DO LIMITE DE VELOCIDADE VEL: "+vel+"km/h, PERMITIDO SOMENTE 80km/h");
            System.out.println("SEM MULTAS!!!");
        }
        
        entrada.close();
    }
}
