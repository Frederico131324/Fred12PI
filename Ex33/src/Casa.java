public class Casa {

    private int quartos;
    private int casaDeBanho;
    private String rua;

    public Casa(int quartos, int casaDeBanho, String rua){
        this.quartos = quartos;
        this.casaDeBanho = casaDeBanho;
        this.rua = rua;
    }


    public void setQuartos(int quartos){
        this.quartos = quartos;
    }

    public int getQuartos(){
        return quartos;
    }


    public void setCasaDeBanho(int casaDeBanho){
        this.casaDeBanho = casaDeBanho;
    }

    public int getCasaDeBanho(){
        return casaDeBanho;
    }


    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return rua;
    }



}