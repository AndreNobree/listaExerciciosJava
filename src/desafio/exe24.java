// Faça um algoritmo que pergunte a distância que um passageiro deseja
// percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
// viagens até 200Km e R$0.45 para viagens mais longas.

package desafio;
import java.util.Scanner;
public class exe24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("DIGITE A DISTÂNCIA QUE DESEJA PERCORRER: ");
        Double dist = entrada.nextDouble();

        if (dist < 200){
            dist *= 0.50;
            System.out.println("PREÇO A SER PAGO É: R$" + dist+ " (taxa - R$0,50)");
        }else if (dist > 200){
            dist *= 0.45;
            System.out.println("PREÇO A SER PAGO É: R$" + dist+ " (taxa - R$0,45)");
        }

        entrada.close();
    }
}
