package ZZZPRACTICAS.ADDYDELETE;

import java.util.Arrays;

public class CamionCoche {

    private String nombre;
    private String chofer;

    public CamionCoche(String nombre, String chofer) {
        this.nombre = nombre;
        this.chofer = chofer;
    }

    private Coche[] arraycoche = new Coche[0];
    private Integer indice = 0;

    public void addCoche(Coche cochecito) {
        this.arraycoche = Arrays.copyOf(this.arraycoche, this.arraycoche.length + 1);
        this.arraycoche[indice] = cochecito;
        indice++;
    }
    public boolean eliminarCoche (Integer numero) {
        for (int i = 0; i < this.arraycoche.length; i++) {
            if (numero == i) {
                Coche[] Aux = Arrays.copyOfRange(this.arraycoche, i + 1, this.arraycoche.length);
                int numearoAux = i;
                for (int j = 0; j < Aux.length; j++) {
                    this.arraycoche[numearoAux] = Aux[j];
                    numearoAux++;
                }
                this.arraycoche = Arrays.copyOf(this.arraycoche, this.arraycoche.length - 1);
                indice--;
                return true;
            }
        }
        System.out.println("El numero de coche no se encuentra.");
        return false;
    }


    public boolean eliminarCocheobjeto (Coche cochecito) {
        for (int i = 0; i < this.arraycoche.length; i++) {
            if (cochecito.equals(arraycoche[i])) {
                Coche[] Aux = Arrays.copyOfRange(this.arraycoche, i + 1, this.arraycoche.length);
                int numearoAux = i;
                for (int j = 0; j < Aux.length; j++) {
                    this.arraycoche[numearoAux] = Aux[j];
                    numearoAux++;
                }
                this.arraycoche = Arrays.copyOf(this.arraycoche, this.arraycoche.length - 1);
                indice--;
                return true;
            }
        }
        System.out.println("El coche no se encuentra.");
        return false;
    }



    @Override
    public String toString() {
        return "CamionCoche{" +
                "nombre='" + nombre + '\'' +
                ", chofer='" + chofer + '\'' +
                ", arraycoche=" + Arrays.toString(arraycoche) +
                '}';
    }
}
