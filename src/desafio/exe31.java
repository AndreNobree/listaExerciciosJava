// Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

package desafio;
import java.util.Scanner;
import java.util.Random;

public class exe31 {
    public static void main(String[] args) {
        teste();
    }   

    public static void teste(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("ESCOLHA: PEDRA, PAPEL, TESOURA : ");
        String resposta = entrada.nextLine().toUpperCase();

        Random random = new Random();
        int rand = random.nextInt(3);

        if (resposta.equals("PEDRA")){    

            if (rand == 0){
                System.out.println("\n\nBOTEI PEDRA - EMPATE");
                teste();
            }else if (rand == 1){
                System.out.println("\n\nBOTEI PAPEL - VENCI");
                teste();
            }else{
                System.out.println("\n\nBOTEI TESOURA - VOCÊ VENCEU");
                teste();
            }
        }else if (resposta.equals("PAPEL")){
            if (rand == 0){
                System.out.println("\n\nBOTEI PEDRA - VOCÊ VENCEU");
                teste();
            }else if (rand == 1){
                System.out.println("\n\nBOTEI PAPEL - EMPATE");
                teste();
            }else{
                System.out.println("\n\nBOTEI TESOURA - VENCI");
                teste();
            }
        }else if (resposta.equals("TESOURA")){
            if (rand == 0){
                System.out.println("\n\nBOTEI PEDRA - VENCI");
                teste();
            }else if (rand == 1){
                System.out.println("\n\nBOTEI PAPEL - VOCÊ VENCEU");
                teste();
            }else{
                System.out.println("\n\nBOTEI TESOURA - EMPATE");
                teste();
            }
        }else {
            System.out.println("ERRO DE DIGITAÇÃO!!! DIGITE DNV");
            teste();
        }

        entrada.close();
    } 
}
