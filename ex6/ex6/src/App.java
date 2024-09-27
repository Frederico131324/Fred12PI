import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é a temperatura da água:");
        int temperatura = input.nextInt();

    
        if (temperatura >= 100) {
            System.out.println("Está a ferver");
        }
        else System.out.println("Não está quente");

        input.close();
        
    }
}
