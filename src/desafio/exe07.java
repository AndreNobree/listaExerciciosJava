package desafio;
import java.util.Scanner;

public class exe07 {
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    float numero = entrada.nextFloat();
    
    float tercaParte = numero;

    numero *= 2;

    
    tercaParte /= 3;

    System.out.println("o dobro do numero q vc escolheu foi: "+numero+", e sua tercaParte é: "+tercaParte);

    entrada.close();
    }
}
