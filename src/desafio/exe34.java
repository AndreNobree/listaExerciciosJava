// O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
// peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
// indivíduo dentro de certas faixas.
// - abaixo de 18.5: Abaixo do peso
// - entre 18.5 e 25: Peso ideal
// - entre 25 e 30: Sobrepeso
// - entre 30 e 40: Obesidade
// - acima de 40: Obseidade mórbida
// Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
// da altura)


package desafio;
import java.util.Scanner;
public class exe34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE O SEU PESO: ");
        double peso = entrada.nextDouble();
        System.out.print("DIGITE A SUA ALTURA: ");
        double altura = entrada.nextDouble();

        altura *= altura;
        peso /= altura;

        if ( peso <= 18.5 ){ System.out.println("VOCÊ ESTÁ ABAIXO DO PESO "+peso); }
        else if ( peso <= 25 ) { System.out.println("VOCÊ ESTÁ COM O PESO IDEAL!!! "+peso); }
        else if ( peso <= 40 ) { System.out.println("VOCÊ ESTÁ OBESO "+peso); }
        else { System.out.println("VOCÊ ESTÁ COM OBESIDADE MÓRBIDA!!! "+peso); }

        entrada.close();
    }
}
