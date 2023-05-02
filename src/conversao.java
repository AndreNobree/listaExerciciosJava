public class conversao {
    public static void main(String[] args) {
        //NUMERO PARA STRING
        Integer num1 = 10000;
        System.out.println(num1.toString()); // convertido para string
        
        int num2 = 20000;
        System.out.println(Integer.toString(num2)); // convertido para string

        Double num3 = 200.23;
        System.out.println(Double.toString(num3)); // convertido para string

        int num4 = 300;
        System.out.println(("" + num4)); // convertido para string


        //transformar variavel para inteiro
        String x = "10";
        Integer xx = Integer.parseInt(x); 
        System.out.println(xx);

        // string para double
        String valor1 = "23"; 
        String valor2 = "34";

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        System.out.println("numero1: "+ numero1+ " numero2: "+ numero2);

        // numero elevado
        int val1 = 3 * 4 - 10;
        int val2 = (int) Math.pow(val1, 4);
        System.out.println(val2);
    }
}
