import java.util.Scanner;

public class usandoSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("DIGITE UM NUMERO DE 1 A 5");
        int nota = entrada.nextInt();
        String descricaoNota;

        switch (nota) {
            case 1:
                descricaoNota = "tesste1";
                break;
            case 2:
                descricaoNota = "tesste2";
                break;
            case 3:
                descricaoNota = "tesste3";
                break;
            case 4:
                descricaoNota = "tesste4";
                break;
            case 5:
                descricaoNota = "tesste5";
                break;
            case 6:
            case 7:
            case 8:
                descricaoNota = "teste com outros cases";
                break;
            default:
                descricaoNota = "erro";
                break;
        }

        System.out.println(descricaoNota);
        
        entrada.close();
    }
}
