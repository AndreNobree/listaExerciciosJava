// Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
// aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
// carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
// que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
// quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
// tabela a seguir:
// - Carros populares (aluguel de R$90 por dia)
// - Até 100Km percorridos: R$0,20 por Km
// - Acima de 100Km percorridos: R$0,10 por Km
// - Carros de luxo (aluguel de R$150 por dia)
// - Até 200Km percorridos: R$0,30 por Km
// - Acima de 200Km percorridos: R$0,25 por Km

package desafio;
import java.util.Scanner;
public class exe35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("DIGITE O TIPO DE CARRO ESCOLHIDO (POPULAR/LUXO): ");
        String tipo = entrada.nextLine().toUpperCase();
        System.out.print("DIGITE QUANTOS DIAS VOCÊ FICOU COM O CARRO: ");
        int diasAluguel = entrada.nextInt();
        System.out.print("DIGITE A QUILOMETRAGEM PERCORRIDA: ");
        double kmPercorrido = entrada.nextDouble();
        
        if (tipo.equals("POPULAR")){
            double valor = 90;
            
            valor *= diasAluguel;

            if (kmPercorrido <= 100){
                kmPercorrido *= 0.20;
                kmPercorrido += valor;
                System.out.println("VOCÊ PRECISA PAGAR R$"+kmPercorrido);
            }
            else{
                kmPercorrido *= 0.10;
                kmPercorrido += valor;
                System.out.println("VOCÊ PRECISA PAGAR R$"+kmPercorrido);

            }


        }else if (tipo.equals("LUXO")){
            double valor = 150;

            valor *= diasAluguel;

            if (kmPercorrido <= 200){
                kmPercorrido *= 0.30;
                kmPercorrido += valor;
                System.out.println("VOCÊ PRECISA PAGAR R$"+kmPercorrido);
            }
            else{
                kmPercorrido *= 0.25;
                kmPercorrido += valor;
                System.out.println("VOCÊ PRECISA PAGAR R$"+kmPercorrido);

            }
        }

        entrada.close();
    }
}
