public class Metodos {
    public static void main(String[] args) {
        mensagem_de_boas_vindas();
        menu();

    }
    public static void mensagem_de_boas_vindas() {
        System.out.println("Seja bem vindo");
    }

    public static void menu() {
        System.out.println("""

                == Menu ==
                1 - Entradas
                2 - Prato Carne
                3 - Prato Peixe
                4 - Sobremesa
                5 - Sair 
                
                """);
    }
}

