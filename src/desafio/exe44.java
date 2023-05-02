// Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
// incremento, mostrando em seguida todos os valores no intervalo:
// Ex: Digite o primeiro Valor: 3
// Digite o último Valor: 10
// Digite o incremento: 2
// Contagem: 3 5 7 9 Acabou!

package desafio;
import java.util.Scanner;
public class exe44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("ENTRE COM O VALOR INICIAL: ");
        int valIni = entrada.nextInt();
        System.out.print("ENTRE COM O VALOR FINAL: ");
        int valFim = entrada.nextInt();
        System.out.print("ENTRE COM O VALOR DE INCREMENTO: ");
        int valInc = entrada.nextInt();
        
        entrada.close();
        
        for (;valIni < valFim; valIni++){
            if (valIni % valInc == 0){
                System.out.println(valIni);
            }
        }
        
        
    }
}
