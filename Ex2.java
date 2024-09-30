import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x = 1;
        int[] numeros = new int[6];
        while (x < 6) {
            System.out.println("Numero " + x + ": ");
            numeros[x] = input.nextInt();
            x++;
        }

        int maior = numeros[1]; 
        for (int i = 2; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maior);

        input.close();
    }
}
