import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        mensagemDeBoasVindas();

        System.out.print("Escreve a sua idade: ");
        int idade = input.nextInt();
        boolean continuar = true;

        while (continuar) {
            if (idade >= 18) {
                continuar = menu18(input);
            } else {
                continuar = menu(input);
            }
        }
    }

    public static void mensagemDeBoasVindas() {
        System.out.println("Seja Bem Vindo " + user());
    }

    public static boolean menu(Scanner input) {
        System.out.println("""
        
        == Menu ==
        1 - Entradas
        2 - Prato Carne
        3 - Prato Peixe
        4 - Sobremesa
        5 - Sair 
        
        """);
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        return processarOpcao(opcao);
    }

    public static String user() {
        String user = "Maria Joana";
        return user;
    }

    public static boolean menu18(Scanner input) {
        System.out.println("""
        
        == Menu ==
        1 - Entradas
        2 - Prato Carne
        3 - Prato Peixe
        4 - Sobremesa
        5 - Carta de Vinhos
        6 - Sair 
        
        """);
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        return processarOpcao(opcao);
    }

    public static boolean processarOpcao(int opcao) {
        switch (opcao) {
            case 1 -> System.out.println("Escolheste Entradas.");
            case 2 -> System.out.println("Escolheste Prato Carne.");
            case 3 -> System.out.println("Escolheste Prato Peixe.");
            case 4 -> System.out.println("Escolheste Sobremesa.");
            case 5 -> {
                System.out.println("Escolheste Sair.");
                return false; // Para o loop
            }
            case 6 -> System.out.println("Escolheste Carta de Vinhos.");
            default -> System.out.println("Opção inválida.");
        }
        return true; // Continua o loop
    }
}
