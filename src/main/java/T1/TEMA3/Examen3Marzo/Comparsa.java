package T1.TEMA3.Examen3Marzo;

public class Comparsa extends AgrupacionOficial {

    private String empresa_atrezzo;

    public Comparsa(String nombre, String autor, String autor_musica, String autor_letra, String disfraz, Integer puntos_obtenidos, String empresa_atrezzo) {
        super(nombre, autor, autor_musica, autor_letra, disfraz, puntos_obtenidos);
        this.empresa_atrezzo = empresa_atrezzo;
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion de la comparsa: " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La comparsa " + getNombre() + " va de: " + getDisfraz());
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
        System.out.println("La comparsa " + getNombre() + " va caminito del falla");
    }

    public String getEmpresa_atrezzo() {
        return empresa_atrezzo;
    }

    public void setEmpresa_atrezzo(String empresa_atrezzo) {
        this.empresa_atrezzo = empresa_atrezzo;
    }
}
