//Faça um programa usando a estrutura “faça enquanto” que leia a idade de
//várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
//não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
//na tela:
//a) Quantas idades foram digitadas
//b) Qual é a média entre as idades digitadas
//c) Quantas pessoas tem 21 anos ou mais.


package desafio;
import java.util.Scanner;

public class exe62 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String resp;
        int idade = 0; int i = 0; int idadesDigitadas = 0; int somaIdades = 0; int maisVinteUm = 0;
        do {                
            
            System.out.print("DESEJA CONTINUAR?(s/n) ");
            resp = entrada.next();
            
                            
            if ("s".equalsIgnoreCase(resp)) {
                System.out.print("DIGITE A IDADE: ");
                idade = entrada.nextInt();
                somaIdades += idade;
                idadesDigitadas ++;
                
                if(idade >= 21) {
                    maisVinteUm++;
                }
                
                i++;
            }
            else {
                i = 31;
            }
            
            
        } while (i <= 30);{ //enquanto i for menor/igual que 30, ele n entra no while
            somaIdades /= idadesDigitadas;
            System.out.printf("FORAM DIGITADAS %d IDADES\nA MÉDIA DAS IDADES É: %d\nO NÚMERO DE PESSOAS QUE TEM MAIS/IGUAL DE 21 ANOS É %d", idadesDigitadas, somaIdades, maisVinteUm);
        }
        
        
        entrada.close();
    
    }
}