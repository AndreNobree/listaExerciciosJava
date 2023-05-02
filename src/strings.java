public class strings {
    public static void main(String[] args) {

        String A = "Bom dia André";

        A = A.replace("André", "Joyce");
        
        //adciona "!!!" a variavel A 
        A = A.concat("!!!");

        String lower = A.toLowerCase();
        String upper = A.toUpperCase(); 
        System.out.println("\n\nlower e upper case");
        System.out.println("minusculo = "+lower+ " | maiusculo = "+ upper+"\n");

        //verifica se na variavel tem os caracterer "om"
        System.out.println("\n\ncontains");
        System.out.println(A.contains("om"));

        //verifica se tem "Bom" no começo
        System.out.println("\n\nstartsWith");
        System.out.println(A.startsWith("Bom"));
        System.out.println(A.toUpperCase().startsWith("BOM"));
        System.out.println(A.startsWith("Boa"));

        //verifica se teem "Joyce" no final
        System.out.println("\n\nendsWith");
        System.out.println(A.endsWith("Joyce"));

        //quantos caracteres tem...
        System.out.println("\n\nlength");
        System.out.println(A.length());

        //revelar posição
        System.out.println("\n\nindexOf");
        System.out.println(A.indexOf("dia"));

        //imprime a partir da posição indicada
        System.out.println("\n\nsubstring");
        System.out.println(A.substring(4));
        // de - até
        System.out.println(A.substring(4, 12)); 

        //veerifica se a escrita está correta
        System.out.println("\n\nequals");
        System.out.println(A.equals("bom dia Joyce!!!"));
        System.out.println(A.equals("Bom dia Joyce!!!"));
        System.out.println("\n\nequalsIgnoreCase");
        System.out.println(A.equalsIgnoreCase("bom dia Joyce!!!"));

        // numero elevado
        int val1 = 3 * 4 - 10;
        int val2 = (int) Math.pow(val1, 4);
        System.out.println(val2);
    }
}
