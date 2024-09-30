import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x = 0;
        int[] numeros = new int[6];
        int soma = 0;

        while (x < 5) {
            System.out.println("Numero " + (x + 1) + ": ");
            numeros[x] = input.nextInt();
            x++;
        }

        System.out.println("Números ímpares:");
        for (int i = 0; i < 5; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

        input.close();
    }
}
