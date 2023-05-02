// Crie um programa que leia vários números pelo teclado e mostre no final o
// somatório entre eles.
// Obs: O programa será interrompido quando o número 1111 for digitado

package desafio;
import java.util.Scanner;

public class exe56 {
    
    public static void main(String[] args) {
        
        teste();
        
    }
    
    public static void teste(){
        Scanner entrada = new Scanner(System.in);    
        int somaTudo = 0;
        for (int i = 0; i < 20; i++){

            System.out.print("DIGITE UM NÚMERO: ");
            int num = entrada.nextInt();

            if (num == 1111){
                break;
            }else{
                somaTudo+= num;
                System.out.printf("A SOMA TÁ EM %d\n",somaTudo );
            }
        }
        System.out.printf("O SOMATÓRIO É: %d\n", somaTudo);
        
        entrada.close();
    }
}
