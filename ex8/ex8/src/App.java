import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int [] dias = {31,28,31,30,31,30,31,31,30,31,30,31};
        String [] mes = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
        int x = 0;
        System.out.println("Escreve o ano: ");
        int ano = input.nextInt();
    
        while (x < 12) {
            System.out.println("O mês de " + mes[x] + " tem " + dias[x] + ".");
            
            if (ano % 4 == 0);


            x++;
        }
    }
}
