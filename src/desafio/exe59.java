// Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
// perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
// a) qual é a maior idade lida
// b) quantos homens foram cadastrados
// c) qual é a idade da mulher mais jovem
// d) qual é a média de idade entre os homens

package desafio;
import java.util.Scanner;
public class exe59 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String sexo = ""; String resp = "";
        int idadeH = 0; int idadeM = 0; int maiorIdade = 0; int homemCad = 0; int idadesTotalH = 0; int maisJovemM = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("DESEJA PROSSEGUIR? (s/n)");
            resp = entrada.next().toUpperCase();

            if (resp.equals("S")){
                System.out.print("DIGITE O SEXO:(m/f) ");
                sexo = entrada.next().toUpperCase();
                
                if (sexo.equals("M")){
                    System.out.print("DIGITE A IDADE: ");
                    idadeH = entrada.nextInt();
                    homemCad++;
                    idadesTotalH += idadeH;
                }else{  
                    System.out.print("DIGITE A IDADE: ");
                    idadeM = entrada.nextInt();
                }
                // maior idade
                if ( maiorIdade < idadeH ){ maiorIdade = idadeH; }
                else if ( maiorIdade < idadeM ){ maiorIdade = idadeM; }

                //mulher mais jovem
                if ( maisJovemM == 0 ) { maisJovemM += idadeM; }
                else if ( idadeM > maiorIdade ) { maisJovemM = idadeM; }

            }else{
                break;
            }            
        }
        //media
        if ( homemCad > 0 ) { idadesTotalH /= homemCad; }
        System.out.printf("A MAIOR IDADE REGISTRADA FOI: %d\nNO TOTAL FORAM CADASTRADOS %d HOMENS\nA IDADE DA MULHER MAIS JOVEM É DE %d\nA MÉDIA DE HOMENS É: %d", maiorIdade, homemCad, maisJovemM, idadesTotalH);
        
        entrada.close();
    }
}
