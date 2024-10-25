import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        while (true) {
            try {
                System.out.print("Escreve um número: ");
                num1 = input.nextInt();
                break;
                
            } catch (java.util.InputMismatchException e) {
                System.out.println("ERRO: Insere um número inteiro válido.");
                input.nextLine();
            }

        }


        while (true) {
            try {
                System.out.print("Escreve outro número: ");
                num2 = input.nextInt();

                if (num2 == 0) {
                    System.out.println("ERRO: O divisor não pode ser zero!");
                    continue;
                }
                break;
            
            } catch (java.util.InputMismatchException e) {
                System.out.println("ERRO: Insere um numero inteiro válido.");
                input.nextLine();

            }
        }


        int resposta = num1 / num2;
        System.out.println("R:" + resposta);
        input.close();
    }
}