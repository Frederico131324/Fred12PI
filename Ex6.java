import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.print("inicio: ");
    int inicio = input.nextInt();

    System.out.print("fim: ");
    int fim = input.nextInt();
    
    int soma=0;

    for(int i=inicio;i<=fim;i++){
        System.out.println(i);
        soma += i;
    }
    
    System.out.println("Soma: "+ soma);

    input.close();
}
}