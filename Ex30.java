import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        double[] notas = {8.2, 3.2, 4.6, 2.4, 6.1};
        double soma = 0;
        int numero_alunos = 0;

        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
            numero_alunos ++;
        }
    
        double media = soma/numero_alunos;
        int media_inteiro = (int) media;

        System.out.println("Numero de Alunos: " + numero_alunos);
        System.out.println("Media Original: " + media);
        System.out.println("Media convertida: " + media_inteiro);

    }
}
