import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mensagemDeBoasVindas();

        System.out.print("Escreve a sua idade: ");
        int idade = input.nextInt();
        if(idade >= 18){
            menu18();
        }else {
            menu();
        }
    }

    public static void mensagemDeBoasVindas(){
        System.out.println("Seja Bem Vindo "+ user());
    }

    public static void menu(){
        System.out.println("""

        == Menu ==
        1 - Entradas
        2 - Prato Carne
        3 - Prato Peixe
        4 - Sobremesa
        5 - Sair 
        
        """);
    }

    public static String user() {
        String user = "Maria Joana";
        return user;
    }

    public static void menu18(){
        System.out.println("""
            
                == Menu ==
                1 - Entradas
                2 - Prato Carne
                3 - Prato Peixe
                4 - Sobremesa
                5 - Carta de Vinhos
                5 - Sair 
                
                """);
    }
}