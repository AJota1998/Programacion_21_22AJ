package T1.TEMA3.UNIDAD5.ej5Yej6;

public abstract class Instrumento {
    //VARIABLES

    //creamos el enum
    public enum notasEnum {
        DO,
        RE,
        MI,
        FA,
        SOL,
        LA,
        SI
    }
    //creamos el array del tipo notas, que es del tipo del enumerado que hemos creado con su índice
    private notasEnum[] notasArray;
    private int indice;


    //METODOS

    //creamos el constructor
    public Instrumento() {
        notasArray = new notasEnum[100];
        this.indice = 0;
    }

    //metodo para añadir elementos al array
    public void add(notasEnum notas) {
        if (this.indice < notasArray.length) {
            notasArray[indice] = notas;
            this.indice++;
        }
    }

    public notasEnum[] getNotasArray() {
        return notasArray;
    }

    public void setNotasArray(notasEnum[] notasArray) {
        this.notasArray = notasArray;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public abstract void interpretar();
}

