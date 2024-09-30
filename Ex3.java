import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int[] numeros = new int[6];
        int soma = 0;

        while (x < 5) {
            System.out.println("Numero " + (x + 1) + ": ");
            numeros[x] = input.nextInt();
            soma += numeros[x]; 
            x++;
        }

        double media = soma / 5; 

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        input.close();
    }
}
