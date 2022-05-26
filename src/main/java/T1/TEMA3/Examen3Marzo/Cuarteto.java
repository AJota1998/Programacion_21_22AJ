package T1.TEMA3.Examen3Marzo;

public class Cuarteto extends AgrupacionOficial implements Callejera {

    private Integer n_miembros;

    public Cuarteto(String nombre, String autor, String autor_musica, String autor_letra, String disfraz, Integer puntos_obtenidos, Integer n_miembros) {
        super(nombre, autor, autor_musica, autor_letra, disfraz, puntos_obtenidos);
        this.n_miembros = n_miembros;
    }

    @Override
    public void cantar_la_presentacion() {

        System.out.println("Cantando la presentacion del cuarteto: " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El cuarteto " + getNombre() + " va de: " + getDisfraz());
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
        System.out.println("El cuarteto: " + getNombre() + " va caminito del falla");
    }

    public Integer getN_miembros() {
        return n_miembros;
    }

    public void setN_miembros(Integer n_miembros) {
        this.n_miembros = n_miembros;
    }

    @Override
    public void amo_a_escuchar() {
        System.out.println("Amo a escuchar el cuarteto: " + getNombre());
    }
}
