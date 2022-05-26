package T1.TEMA3.U4U5Entregable21_22_Tarde;

import java.util.Arrays;

public class catalogo {

    protected Multimedia[] catalogo;
    private int indice;
    private String nombrecat;

    public catalogo(int num, String nombre) {
        this.catalogo = new Multimedia[num];
        this.indice = indice;
        this.nombrecat = nombre;
    }

    public void add(Multimedia mul) {
        if (indice >= catalogo.length) {
            catalogo = Arrays.copyOf(catalogo, catalogo.length + 1);
        }
        catalogo[indice] = mul;
        indice++;
    }

    @Override
    public String toString() {
        return "catalogo{" +
                "catalogo=" + Arrays.toString(catalogo) +
                ", indice=" + indice +
                ", nombrecat='" + nombrecat + '\'' +
                '}';
    }

    public boolean eliminar_elemento_catalogo(Multimedia mult) {
        for (int i = 0; i < catalogo.length; i++) {
            if(mult.equals(catalogo[i])) {
                catalogo[i] = null;
                Arrays.copyOf(catalogo, catalogo.length-1);
                return true;
            }
        }
        return false;
    }


}
