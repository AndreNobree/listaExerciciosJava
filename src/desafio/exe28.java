// Faça um programa que leia a largura e o comprimento de um terreno
// retangular, calculando e mostrando a sua área em m². O programa também
// devemostrar a classificação desse terreno, de acordo com a lista abaixo:
//  - Abaixo de 100m² = TERRENO POPULAR
//  - Entre 100m² e 500m² = TERRENO MASTER
//  - Acima de 500m² = TERRENO VIP

package desafio;
import java.util.Scanner;
public class exe28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE A LARGURA DO TERRENO: ");
        Double larg = entrada.nextDouble();
        System.out.print("DIGITE O COMPRIMENTO DO TERRENO: ");
        Double comp = entrada.nextDouble();
        
        Double area = larg * comp;
        if (area < 100){
            System.out.println("ÁREA DO TERRENO É "+area+", ISSO É UM TERRENO POPULAR!!!");
        }else if (area < 500){
            System.out.println("ÁREA DO TERRENO É "+area+", ISSO É UM TERRENO MASTER!!!");
        }else{
            System.out.println("ÁREA DO TERRENO É "+area+", ISSO É UM TERRENO VIP!!!");
        }

        entrada.close();
    }
}
