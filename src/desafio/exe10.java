package desafio;
import java.util.Scanner;
public class exe10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("entre com a largura da parede: ");
        float larg = entrada.nextFloat();
        System.out.print("entre com a altura da parede: ");
        float alt = entrada.nextFloat();

        float area = larg * alt;
        float latas = area / 2;
        
        System.out.println("a area é igual a: "+area+" serão necessárias "+latas);

        entrada.close();
    }
}
