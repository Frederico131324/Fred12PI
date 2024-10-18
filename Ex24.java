import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escreve o ano atual: ");
        int ano = input.nextInt();
        System.out.print("Escreve o ano de nascimento: ");
        int nasci = input.nextInt();
        mensagemDeBoasVindas();
        int idade = idade(ano, nasci);
        boolean continuar = true;
        
        while (continuar) {
            continuar = menu(input, idade);
        }
    }

    public static int idade(int ano, int nasci) {
        return ano - nasci;
    }

    public static void mensagemDeBoasVindas() {
        System.out.println("Seja Bem Vindo " + user());
    }

    public static boolean menu(Scanner input, int idade) {
        if (idade >= 18) {
            return menuAdulto(input);
        } else {
            return menuCrianca(input);
        }
    }

    public static String user() {
        return "Maria Joana";
    }

    public static boolean menuAdulto(Scanner input) {
        System.out.println("""
                == Menu Adulto ==
        1 - Entradas
        2 - Prato Carne
        3 - Prato Peixe
        4 - Sobremesa
        5 - Carta de Vinhos
        6 - Sair
                """);
        System.out.print("Escolha uma opção: ");
        int opcao = input.nextInt();
        return Opcao(opcao, true);
    }

    public static boolean menuCrianca(Scanner input) {
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
        return Opcao(opcao, false);
    }

    public static boolean Opcao(int opcao, boolean adulto) {
        switch (opcao) {
            case 1 -> System.out.println("Escolheste Entradas.");
            case 2 -> System.out.println("Escolheste Prato Carne.");
            case 3 -> System.out.println("Escolheste Prato Peixe.");
            case 4 -> System.out.println("Escolheste Sobremesa.");
            case 5 -> {
                if (adulto) {
                    System.out.println("Escolheste Carta de Vinhos.");
                } else {
                    System.out.println("Escolheste Sair.");
                    return false;
                }
            }
            case 6 -> {
                if (adulto) {
                    System.out.println("Escolheste Sair.");
                    return false;
                } else {
                    System.out.println("Opção inválida.");
                }
            }
            default -> System.out.println("Opção inválida.");
        }
        return true;
    }
}
