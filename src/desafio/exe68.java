//Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
//“para”. No final, mostre na tela:
//a) Quantas mulheres foram cadastradas
//b) Quantos homens pesam mais de 100Kg
//c) A média de peso entre as mulheres
//d) O maior peso entre os homens

package desafio;
import java.util.Scanner;
public class exe68 {
    
    public static int pesoMasculino = 0;
    public static int quantFeminino = 0;
    public static Double mediaFeminina = 0.0;
    public static Double maiorMasculino = 0.0;
    
    public static void quest68() {
        Scanner entrada = new Scanner(System.in);
        
        String sexo;
        Double peso; 
        
        for (int i = 0; i < 2; i++) {
            
            System.out.print("DIGITE O SEXO:(m/f) ");
            sexo = entrada.next();
            
            
            System.out.print("DIGITE O PESO: ");
            peso = entrada.nextDouble();
            
            if ("f".equalsIgnoreCase(sexo)) {
                quantFeminino++;
                mediaFeminina += peso;
            }
            if ("m".equalsIgnoreCase(sexo) && peso > 100) {
                pesoMasculino++;
            }
            //pegando o maior peso
            if (peso > maiorMasculino) {
                maiorMasculino = peso;
            }
            
        }
        
        entrada.close();
    }
    
    public static void main(String[] args) {
        
        quest68();
        //media feminina
        mediaFeminina /= 8;
        System.out.printf("EXISTEM %d MULHERES\n%d HOMENS PESAM MAIS DE 100Kg\nA MEDIA DO PESO DAS MULHERES É: %.2f\nO MAIOR PESO ENTRE OS HOMENS É: %.1fKG",quantFeminino, pesoMasculino, mediaFeminina, maiorMasculino );
    }
}