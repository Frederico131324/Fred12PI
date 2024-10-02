public class Ex18 {
    public static void main(String[] args) {
        
        int soma = 0;
        int num = 0;
        
        for (int i = 1; i <= 1000; i++) {            
            
            if (i % 3 == 0 && i % 5 == 0) {
                soma += i;    
                System.out.println(i);
                num++;
            }
            if (num == 5){
                break;
            }
        
        }
        System.out.println("Soma: " + soma);
    }
}     
    

