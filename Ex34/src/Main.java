public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        System.out.print(data.getDia()+ "/");
        System.out.print(data.getMes()+ "/");
        System.out.println(data.getAno());

        data.setData(27,4,2007);

        System.out.print(data.getDia()+ "/");
        System.out.print(data.getMes()+ "/");
        System.out.println(data.getAno());
    }
}