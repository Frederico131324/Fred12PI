import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        
        while (true) {       
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nome: ");
        int nome = input.nextInt();

        System.out.println("Idade: ");
        int idade = input.nextInt();

        System.out.println("Salario: ");
        int salario = input.nextInt();

        System.out.println("Sexo: ");
        int sexo = input.nextInt();

        System.out.println("Estado civil: ");
        int estado_civil = input.nextInt();
           
        if (nome.lenght){
            System.out.println("Numero inválido escreve denovo: ");
        } else {
            System.out.println("Nice");
            break;

        }
        
        }
    }
}
