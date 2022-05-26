package T1.TEMA3.Examen3Marzo;

public class Romancero extends Agrupacion implements Callejera {

    private String tematica_cartelon;

    public Romancero(String nombre, String autor, String autor_musica, String autor_letra, String disfraz, String tematica_cartelon) {
        super(nombre, autor, autor_musica, autor_letra, disfraz);
        this.tematica_cartelon = tematica_cartelon;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del romancero: " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero " + getNombre() + " va de: " + getDisfraz());
    }

    public String getTematica_cartelon() {
        return tematica_cartelon;
    }

    public void setTematica_cartelon(String tematica_cartelon) {
        this.tematica_cartelon = tematica_cartelon;
    }

    @Override
    public void amo_a_escuchar() {
        System.out.println("Amo a escuchar el Romancero: " + getNombre());
    }
}
