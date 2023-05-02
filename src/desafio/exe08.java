package desafio;
import java.util.Scanner;

public class exe08 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a distância em metros: ");
    float dist = entrada.nextFloat();

    float km = dist/1000;
    float dam = dist/10;

    System.out.println("A distância percorrida em km é: "+km+" e em dam é: "+dam);


    entrada.close();
    }
}
