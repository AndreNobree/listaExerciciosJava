public class variaveis {
    public static void main(String[] args) {

        /*  
        "var" faz com que o sistema interprete o tipo de variavel 
        q vc está usando sem precisar dizer de q tipo ela é
        */
        var nome = "Andre";
        System.out.println(nome);
        var idade = 23;
        System.out.println(idade);

        

        byte anosDeEmpresa = 127; // até 127
        System.out.println(anosDeEmpresa);

        short numerosDeeeVoos = 5442; //4 caracteres
        System.out.println(numerosDeeeVoos);

        int id = 1234567890; // 10 caracteres
        System.out.println(id);

        long pontosAcumulados = 1234567890987654321L; // 19 caracteres + L de long
        System.out.println(pontosAcumulados);

        float salario = 8901239.44F; // 10 caracteeres + . + F
        System.out.println(salario);

        double vendasAcumuladas = 1234567.01; // 10 caracteeres + . 
        System.out.println(vendasAcumuladas);

        boolean empregado = true; // true or false
        System.out.println(empregado);

        char status = 'A'; // 1 caracteeres + aspas simples -> '' 
        System.out.println(status);


        // numero elevado
        int val1 = 3 * 4 - 10;
        int val2 = (int) Math.pow(val1, 4);
        System.out.println(val2);


        // ATRIBUIÇÕES
        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // c = c + b
        System.out.println(c);
        c -= a; // c = c - a
        System.out.println(c);
        c *= b; // c = c * b
        System.out.println(c);
        c /= a; // c = c / a
        System.out.println(c);
        c %= 2; // c = c % 2 -> 0 ou 1
        System.out.println(c);


        // UNÁRIOS
        int aa = 1;
        int bb = 2;

        aa++; // aa = aa + 1
        System.out.println(aa);
        aa--; // aa = aa - 1
        System.out.println(aa);
        ++bb; // bb = bb + 1
        System.out.println(bb);
        --bb; // bb = bb - 1
        System.out.println(bb);


        // TERNÁRIOS
    }
}
