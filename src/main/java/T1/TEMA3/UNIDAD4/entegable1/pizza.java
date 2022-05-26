package T1.TEMA3.UNIDAD4.entegable1;

public class pizza {


    // creamos un enum con los tamaños disponibles
    public enum size {
     familiar,
     mediana
    }
    private ingrediente[]ing = new ingrediente[3];
    private int indice = 0; 
    private size tam_pizza; 

    //creamos un constructor al que solo le pasamos el tamaño
    public pizza(size tam_pizza) {
        this.tam_pizza = tam_pizza;
    }

    //creamos un constructor que crea una pizza familiar de jamon y queso por defecto
    public pizza() {
        this.tam_pizza = size.familiar;
        ingrediente c_ing = new ingrediente("jamon iberico", 150);
        ingrediente c_ing2 = new ingrediente("queso", 250);
        this.ing[indice++] = c_ing;
        this.ing[indice++] = c_ing2;
    }

    //metodo muestra los tamaños disponibles
    public static void imprimir() {
        for(size imprime : size.values())
            System.out.println(imprime);
    }

    //metodo numero de ingredientes
    public void num_ing(int indice) {
        System.out.println(indice);
    }

    //aqui me quedo

    



}
