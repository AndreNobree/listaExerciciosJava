import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class wedding {

    public static List<String> itens = new ArrayList<>();

    public static boolean addItem() {
        Scanner entrada = new Scanner(System.in);

        int i;
        String novoItem, perg;

        for (i = 0; i < 90; i++){
            System.out.print("DESEJA VER A LISTA ANTES DE ADICIONAR ALGO? (s/n)\nSE DESEJAR SAIR, DIGITE SAIR\n>> ");
            perg = entrada.nextLine();

            if (perg.equalsIgnoreCase("s")){
                System.out.println("\nLISTA:\n"+itens+"\n");
            }
            else{
                return false;
            }

            System.out.print("ADICIONE UM ITEM A LISTA!! ");
            novoItem = entrada.nextLine().trim();

            if (novoItem.equalsIgnoreCase("sair")){
                return false;
            }

            itens.add(novoItem);
        }
        entrada.close();
        return true; // retorna true se tudo ocorrer bem
    }

    public static void menu() {
        Scanner entrada = new Scanner(System.in);

        while (true) { // loop infinito
            System.out.println("1 - CADASTRAR ITEM");
            System.out.println("2 - DOAR ITEM");
            System.out.print("3 - SAIR DO PROGRAMA\n>> ");
            int respMenu = entrada.nextInt();

            switch (respMenu) {
                case 1:
                    if (!addItem()) { // verifica se addItem() retornou false
                        System.out.println("RETORNANDO PARA O MENU PRINCIPAL...\n\n");
                    }
                    break;
                case 2:
                    if (!pegaItem()) { // verifica se pegaItem() retornou false
                        System.out.println("RETORNANDO PARA O MENU PRINCIPAL...\n\n");
                    }
                    break;

                case 3:
                    System.out.println("\n\nPROGRAMA FINALIZADO");
                    System.exit(0); // encerra o programa com código de saída 0
                default:
                    System.out.println("\n\nCODIGO INVÁLIDO\n\n");
                    break;

            }
        }

    }

    public static boolean pegaItem() {
        Scanner entrada = new Scanner(System.in);
        String perg = "";
        String retiraItem;

        while (!perg.equalsIgnoreCase("n")){
            System.out.print("\n\nDESEJA DOAR ALGUM ITEM?(s/n)\n>> ");
            perg = entrada.next();

            if (perg.equalsIgnoreCase("s")){
                System.out.print("\n\nQUAL ITEM VOCÊ DESEJA ESCOLHER PARA DOAR?\n"+itens+"\n\nOBS: SE QUISER SAIR É SO DIGITAR SAIR\n>> ");
                retiraItem = entrada.next();
                itens.remove(retiraItem);
            } else {
                entrada.close();
                return false;
            }
        }
        entrada.close();
        return true;
    }

    public static void main(String[] args) {
        menu();
    }
}
