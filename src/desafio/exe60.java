// Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
// O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
// a) O nome da pessoa mais velha
// b) O nome da mulher mais jovem
// c) A média de idade do grupo
// d) Quantos homens tem mais de 30 anos
// e) Quantas mulheres tem menos de 18 anos

package desafio;
import java.util.Scanner;
public class exe60 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome = ""; String sexo = ""; String maisJovemString = ""; String maisVelhaString = ""; String maisVelhoString = ""; String maisVelho = "";
        int idade = 0; int idadeM = 0; int idadeF = 0; int somaIdade = 0; int mulherJovem = 0; int homemVelho = 0; int mulherVelha = 0; 

        for (int i = 0; i < 5; i++){
            System.out.print("DIGITE SEU NOME: ");
            nome = entrada.next();

            System.out.print("DIGITE SUA IDADE: ");
            idade = entrada.nextInt();
            somaIdade += idade;

            System.out.print("DIGITE SEU SEXO: ");
            sexo = entrada.next().toUpperCase();

            if ( sexo.equals("M") ){

                if ( idade > 30 ) { idadeM++; }
                
                if ( homemVelho == 0){ homemVelho += idade; maisVelhoString = nome; }
                else if ( idade > homemVelho ) { homemVelho = idade; maisVelhoString = nome;  }

            }else if ( sexo.equals("F") ){

                if ( idade < 18 ) { idadeF++; }

                if ( mulherJovem == 0 ) { mulherJovem += idade; maisJovemString = nome;}
                else if ( idade < mulherJovem ) { mulherJovem = idade; maisJovemString = nome;}
                
                if ( idade > mulherVelha) { mulherVelha = idade; maisVelhaString = nome; }
            }
        }
        //mais velho
        if (homemVelho > mulherVelha){ maisVelho = maisVelhoString; }
        else { maisVelho = maisVelhaString; }
        //média
        somaIdade /= 5;
        System.out.printf("A PESSOA MAIS VELHA É: %s\nO NOME DA MULHER MAIS JOVEM É: %s\nA MÉDIA DO GRUPO É: %d\n%d HOMENS TEM MAIS DE 30 ANOS\n%d MULHERES TEM MENOS DE 18 ANOS", maisVelho, maisJovemString, somaIdade, idadeM, idadeF);

        entrada.close();
    }
}
