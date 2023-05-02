// Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
// a) Quantos homens foram cadastrados
// b) Quantas mulheres foram cadastradas
// c) A média de idade do grupo
// d) A média de idade dos homens
// e) Quantas mulheres tem mais de 20 anos

package desafio;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class exe53 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> listHomem = new ArrayList<>();
        List<Integer> listMulher = new ArrayList<>();

        //variaveis INT: 
        int homensCad = 0; int mulheresCad = 0; int homensIdade = 0; int mulheresIdade = 0; int somaH = 0; int somaM = 0; 
        int media = 0; int mediaH = 0; int maisVinteM = 0;
        //variaveis STRING: 
        String sexo = "";

        for ( int i = 0; i < 5; i++ ){

            System.out.print("DIGITE O SEXO: ");
            sexo = entrada.next().toUpperCase();

            if ( sexo.equals("M") ){
                homensCad++;
                System.out.print("DIGITE A IDADE: ");
                homensIdade = entrada.nextInt();
                listHomem.add(homensIdade);

            }else if ( sexo.equals("F") ){
                mulheresCad++;
                System.out.print("DIGITE A IDADE: ");
                mulheresIdade = entrada.nextInt();

                if (mulheresIdade > 20){

                    maisVinteM++;
                    listMulher.add(mulheresIdade);

                }else{
                    listMulher.add(mulheresIdade);
                }
                
            }else{
                System.out.println("SEXO INVÁLIDO = 0");
            }           
        }
        System.out.printf("\nFORAM CADASTRADOS %d Homens e %d Mulheres\n\n", homensCad, mulheresCad);
    
        for ( int pegaIdadeHomem : listHomem ){ somaH += pegaIdadeHomem; }

        for ( int pegaIdadeMulher : listMulher ){ somaM += pegaIdadeMulher; }
        
        //media total
        media = somaM + somaH; 
        media /= 2;
        //media homem
        mediaH = somaH / homensCad;

        System.out.printf("SOMA DE HOMENS: %d \nSOMA DE MULHERES: %d \nA MÉDIA DE IDADES É: %d \nA MÉDIA DE IDADE DOS HOMENS É: %d \nTOTAL DE MULHERES ACIMA DE 20 É: %d", somaH, somaM, media, mediaH, maisVinteM );


        
        entrada.close();
    }
}
