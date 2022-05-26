package T1.TEMA3.Examen3Marzo;

import java.util.Arrays;

public class Coro extends AgrupacionOficial {

    private Integer numero_bandurrias;
    private Integer numero_guitarras;


    public Coro(String nombre, String autor, String autor_musica, String autor_letra, String disfraz, Integer puntos_obtenidos, Integer numero_bandurrias, Integer numero_guitarras) {
        super(nombre, autor, autor_musica, autor_letra, disfraz, puntos_obtenidos);
        this.numero_bandurrias = numero_bandurrias;
        this.numero_guitarras = numero_guitarras;
    }

    public Integer getNumero_bandurrias() {
        return numero_bandurrias;
    }

    public void setNumero_bandurrias(Integer numero_bandurrias) {
        this.numero_bandurrias = numero_bandurrias;
    }

    public Integer getNumero_guitarras() {
        return numero_guitarras;
    }

    public void setNumero_guitarras(Integer numero_guitarras) {
        this.numero_guitarras = numero_guitarras;
    }

    @Override
    public void insertar_integrante(Integrante i) {
        super.insertar_integrante(i);
    }

    @Override
    public boolean eliminar_integrante(Integrante integr) {
        return super.eliminar_integrante(integr);
    }

    @Override
    public void caminito_del_falla() {
        System.out.println("El coro: " + getNombre() + " va caminito del falla");
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del coro: " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El coro " + getNombre() + " va de: " + getDisfraz());
    }

    @Override
    public String toString() {
        return "Coro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                ", numero_agrupaciones=" + numero_agrupaciones +
                ", puntos_obtenidos=" + puntos_obtenidos +
                ", arrayIntegrante=" + Arrays.toString(arrayIntegrante) +
                ", numero_bandurrias=" + numero_bandurrias +
                ", numero_guitarras=" + numero_guitarras +
                '}';
    }


}
