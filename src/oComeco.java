
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class oComeco {
    public static String nome;
    public static String idade;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // permitir a entrada do usuario
        //criação de lista chamada nomes
        List<String> nomes = new ArrayList<>(); //O new é usada para criar um novo objeto.
        List<String> idades = new ArrayList<>();
        
        entradas();
                
        nomes.add(nome);
        idades.add(idade);

        menu();

        System.out.print(">");
        int opcao = entrada.nextInt();

        if(opcao == 1){
            System.out.println("VOCÊ SELECIONOU A OPÇÃO USUÁRIOS");

            for (String nomee : nomes) {
                System.out.println("USUÁRIOS CADASTRADOS :" + nomee);
            }

        }else if(opcao == 2){
            System.out.println("VOCÊ SELECIONOU A OPÇÃO USUÁRIOS + IDADES");

            for (String nomee : nomes) {
                System.out.println("USUÁRIOS CADASTRADOS :" + nomee);
            }
            
            for (String idadee : idades) {
                System.out.println("USUÁRIOS CADASTRADOS :" + idadee);
            }

        }else if(opcao == 3){
            entradas();
            nomes.add(nome);
            idades.add(idade);
            menu();

        }else if(opcao == 4){
            System.out.println("VOCÊ SELECIONOU A OPÇÃO VERSÃO DO PROGRAMA");
            System.out.println("--VERSÃO 1.0--");

        }else{
            System.out.println("OPÇÃO INVÁLIDA");
        }



        entrada.close();// fechar a entrada

    }
    public static void menu() {
        System.out.println("SELECIONE UMA OPÇÃO\n");
        System.out.println("- USUÁRIOS [1]");
        System.out.println("- USUÁRIOS + IDADES [2]");
        System.out.println("- CADASTRAR OUTRO USUÁRIO [3]");
        System.out.println("- VERSÃO DO PROGRAMA [4]");
    }
    public static void entradas(){
        Scanner entrada = new Scanner(System.in); // permitir a entrada do usuario
        
        System.out.print("DIGITE SEU NOME: ");
        nome = entrada.nextLine();
        
        System.out.print("\nDIGITE SUA IDADE: ");
        idade = entrada.nextLine();
        System.out.println("REGISTRANDO O "+nome+" DE IDADED "+idade+" NO BANCO DE DADOS");

        //O CODIGO SO PODE TER UM "entrada.close();"
        // entrada.close(); 
    }
}
