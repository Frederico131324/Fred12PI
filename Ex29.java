import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreve um numero: ");
        double x = input.nextDouble();

        // TYPECAST EXPLICITO
        int numero = (int) x;
        float numero2 = (float) x;
        long numero3 = (long) x;


        System.out.println("Valor original: " + x);
        System.out.println("Valor int: " + numero);
        System.out.println("Valor float: " + numero2);
        System.out.println("Valor long: " + numero3);
    
    
    }
}
