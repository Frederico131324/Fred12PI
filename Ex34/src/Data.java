public class Data {

    private int dia;
    private int mes;
    private int ano;


    public Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1;
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public int getAno(){
        return ano;
    }

    public void setData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
}