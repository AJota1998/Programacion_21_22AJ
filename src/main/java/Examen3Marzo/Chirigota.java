package Examen3Marzo;

public class Chirigota extends AgrupacionOficial implements Callejera{

    private Integer n_cumples;

    public Chirigota(String nombre, String autor, String autor_musica, String autor_letra, String disfraz, Integer puntos_obtenidos, Integer n_cuples) {
        super(nombre, autor, autor_musica, autor_letra, disfraz, puntos_obtenidos);
        this.n_cumples = n_cuples;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion de la chirigota: " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La chirigota " + getNombre() + " va de: " + getDisfraz());
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
        System.out.println("La chirigota: " + getNombre() + " va caminito del falla");
    }

    public Integer getN_cumples() {
        return n_cumples;
    }

    public void setN_cumples(Integer n_cumples) {
        this.n_cumples = n_cumples;
    }

    @Override
    public void amo_a_escuchar() {
        System.out.println("Amo a escuchar la chirigota: " + getNombre() );
    }
}
