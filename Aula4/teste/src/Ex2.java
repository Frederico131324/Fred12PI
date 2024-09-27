import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        while (true) {       
            System.out.println("Nome de utilizador: ");
            String nome = input.nextLine();

            System.out.println("Password: ");
            String pass = input.nextLine();

            if (nome == pass){
                System.out.println("Password igual ao username, digite novamente: "); 
            } else {
                System.out.println("Nice");
                break;
            }
        }
        
        input.close();
    }
}
