package T1.TEMA3.Examen3Marzo;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {

    protected Integer puntos_obtenidos;



    protected Integrante [] arrayIntegrante = new Integrante[0];
    protected static Integer indiceArray = 0;

    public AgrupacionOficial(String nombre, String autor, String autor_musica, String autor_letra, String disfraz, Integer puntos_obtenidos) {
        super(nombre, autor, autor_musica, autor_letra, disfraz);
        this.puntos_obtenidos = puntos_obtenidos;
    }


    public void insertar_integrante(Integrante i) {
        this.arrayIntegrante = Arrays.copyOf(this.arrayIntegrante, this.arrayIntegrante.length + 1);
        this.arrayIntegrante[indiceArray] = i;
        indiceArray++;
    }
    public boolean eliminar_integrante (Integrante integr) {
        for (int i = 0; i < this.arrayIntegrante.length; i++) {
            if (integr.equals(arrayIntegrante[i])) {
                Integrante [] Aux = Arrays.copyOfRange(this.arrayIntegrante, i + 1, this.arrayIntegrante.length);
                int numearoAux = i;
                for (int j = 0; j < Aux.length; j++) {
                    this.arrayIntegrante[numearoAux] = Aux[j];
                    numearoAux++;
                }
                this.arrayIntegrante = Arrays.copyOf(this.arrayIntegrante, this.arrayIntegrante.length - 1);
                indiceArray--;
                return true;
            }
        }
        System.out.println("El integrante no se encuentra.");
        return false;
    }

    public abstract void caminito_del_falla();

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "puntos_obtenidos=" + puntos_obtenidos +
                ", arrayIntegrante=" + Arrays.toString(arrayIntegrante) +
                '}';
    }

    public Integer getPuntos_obtenidos() {
        return puntos_obtenidos;
    }

    public void setPuntos_obtenidos(Integer puntos_obtenidos) {
        this.puntos_obtenidos = puntos_obtenidos;
    }
}
