package desafio;
import java.util.Scanner;
public class exe45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("ENTRE COM O VALOR INICIAL: ");
        int valIni = entrada.nextInt();
        System.out.print("ENTRE COM O VALOR FINAL: ");
        int valFim = entrada.nextInt();
        System.out.print("ENTRE COM O VALOR DE INCREMENTO: ");
        int valInc = entrada.nextInt();
        
        entrada.close();
        if (valFim < valIni){
            for (;valIni >= valFim; valIni--){
                if (valIni % valInc == 0){
                    System.out.println(valIni);
                }
            }
        }else{
            for (;valIni <= valFim; valIni++){
                if (valIni % valInc == 0){
                    System.out.println(valIni);
                }
            }
        }
        
    }
}
