package ZZZPRACTICAS.EJPIZZA;

public class Ingrediente {

    private String IngName;
    private int Calorias;

    public Ingrediente(String IngName,int Calorias){
        this.IngName=IngName;
        this.Calorias=Calorias;
    }

    public Ingrediente(){
        this.IngName="Queso";
        this.Calorias=250;
    }

    public String MostrarInfo(){
        return this.IngName;
    }
}
