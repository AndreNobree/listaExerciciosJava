package desafio;
import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("INFORME O NUMEROM DE A:");
        int numa = entrada.nextInt();
        System.out.print("INFORME O NUMEROM DE B:");
        int numb = entrada.nextInt();
        System.out.print("INFORME O NUMEROM DE C:");
        int numc = entrada.nextInt();

        int numaa = numa * numa;
        // int numbb = numb * numb;

        int result1 = numaa + numb + numc;

        System.out.println("1° equação: "+result1);

        entrada.close();
    }
}
