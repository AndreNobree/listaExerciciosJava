public class concatenacao {
    public static void main(String[] args) {
        var nome = "Andre";
        var idade = 23;
        var nasc = "11/05/2000";
        var salario = 2500.00;

        System.out.println("Nome: "+ nome+ " idade: "+idade + " nascimento: "+nasc+" salario: "+salario);
        //ou pode ser feito assim
        System.out.printf("Nome: %s \nidade: %d \nnascimento: %s \nSalario %.2f", nome, idade, nasc, salario);
       // %s - string / %d - inteiro / %f - float 
    }
}
