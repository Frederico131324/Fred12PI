import java.util.Arrays;
import java.util.List;

public class App {
    
    private final static List<String> list = Arrays.asList("a", "e", "i", "o", "u"); 
    
    public static void main(String[] args) throws Exception {
        String letter = "a";       
        if (list.contains(letter))
            System.out.println("É uma vogal");
        else 
            System.out.println("É uma consoante");
    }
}
