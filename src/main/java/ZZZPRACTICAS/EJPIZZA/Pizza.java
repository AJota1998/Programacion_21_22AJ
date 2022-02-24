package ZZZPRACTICAS.EJPIZZA;

public class Pizza {

    int indice=0;

    public enum Size{
        Mediana,
        Familiar
    };

    public Ingrediente[] Lista_Ing = new Ingrediente[3];
    private Size PizzaSize;

    public Pizza(Size PizzaSize){
        this.PizzaSize=PizzaSize;
    }

    public Pizza(){
        this.PizzaSize=Size.Familiar;
    }

//METODOS

    public void CantidadIngredientes(){
        int contador=0;
        for (int i = 0; i < Lista_Ing.length; i++) {
            if (Lista_Ing[i]!=null){
                contador++;
            }
        }
        System.out.println("La pizza contiene "+ contador +" ingredientes.");
    }

    public void SizesDeLasPizzas(){
        for (Size PizzaSize : Size.values()) {
            System.out.println(PizzaSize);
        }
    }

    public boolean AgregoIngrediente(Ingrediente ing){

        if (indice<Lista_Ing.length){
            Lista_Ing[indice]=ing;
            indice++;
            return true;
        } else {
            return false;
        }
    }

    public void Info(){
        System.out.println("La información de la/s pizza/s es la siguiente:");
        System.out.println("El tamaño escogido es: "+this.PizzaSize);
        System.out.println("Los ingredientes escogidos son: ");
        for (int i = 0; i < indice; i++) {
            System.out.print(Lista_Ing[i].MostrarInfo()+" ");
        }
    }
}
