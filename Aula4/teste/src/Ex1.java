import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        
        while (true) {       
        
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é a nota(0/10):");
        int nota = input.nextInt();
           
        if ((nota > 10) || (nota < 0)){
            System.out.println("Numero inválido escreve denovo: ");
        } else {
            System.out.println("Nice");
            break;

        }
        
        }
    }
}
