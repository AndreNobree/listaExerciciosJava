// Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
// de triângulo será formado:
//  - EQUILÁTERO: todos os lados iguais
//  - ISÓSCELES: dois lados iguais
//  - ESCALENO: todos os lados diferentes


package desafio;
import java.util.Scanner;
public class exe30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("DIGITE O PRIMEIRO LADO DO TRIANGULO");
        int lado1 = entrada.nextInt();
        System.out.println("DIGITE O SEGUNDO LADO DO TRIANGULO");
        int lado2 = entrada.nextInt();
        System.out.println("DIGITE O TERCEIRO LADO DO TRIANGULO");
        int lado3 = entrada.nextInt();

        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("ESSE TRAINGULO É EQUILÁTERO");
        }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.println("ESSE TRIANGULO É  ISÓSCELES");
        }else{
            System.out.println("ESSE TRIANGULO É ESCALENO");
        }

        entrada.close();
    }
}
