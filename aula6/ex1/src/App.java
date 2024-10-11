public class App {
    public static void main(String[] args) throws Exception {


        int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6}};

        int[][] matriz2 = {
            {1, 4},
            {2, 5},
            {3, 6}};

        System.out.println("Matriz Original:");
        for (int i = 0; i < matriz.length; i++) { 
            for (int j = 0; j < matriz[i].length; j++) { 
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println(); 
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < matriz2.length; i++) { 
            for (int j = 0; j < matriz2[i].length; j++) { 
                System.out.print(matriz2[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
}
