//Crie um programa usando a estrutura “faça enquanto” que leia vários números.
//A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na
//tela:
//a) O somatório entre todos os valores
//b) Qual foi o menor valor digitado
//c) A média entre todos os valores
//d) Quantos valores são pares

package desafio;
import java.util.Scanner;
public class exe63 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String resp;
        int numero = 0; int i = 0; int numerosDigitados = 0; int somaNum = 0; int numeroPar = 0; int media; int menorValor = 0;
        do {                
            
            System.out.print("DESEJA CONTINUAR?(s/n) ");
            resp = entrada.next();
            
                            
            if ("s".equalsIgnoreCase(resp)) {
                System.out.print("DIGITE UM NÚMERO: ");
                numero = entrada.nextInt();
                somaNum += numero;
                numerosDigitados ++;
                
                if ( numero % 2 == 0 ) {
                    numeroPar++;
                }
                if ( menorValor == 0 ) {
                    menorValor += numero;
                }
                else if (numero < menorValor) {
                    menorValor = numero;
                }
                
                i++;
            }
            else {
                i = 31;
            }
            
            
        } while (i <= 30);{ //enquanto i for menor/igual que 30, ele n entra no while
            media = somaNum / numerosDigitados;
            System.out.printf("O SOMATÓRIO DE TODAS AS IDADES É: %d \nO MENOR NÚMERO É %d \nA MÉDIA DE TODAS AS IDADES É: %d \nEXISTEM %d NÚMEROS PARES", somaNum, menorValor, media, numeroPar);
        }
        
        
        entrada.close();
    
    
    }
}