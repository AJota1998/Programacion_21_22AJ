package T1.TEMA3.Examen3Marzo;

public abstract class Agrupacion {

    protected String nombre;
    protected String autor;
    protected String autor_musica;
    protected String autor_letra;
    protected String disfraz;
    protected static Integer numero_agrupaciones = 0;

    public Agrupacion(String nombre, String autor, String autor_musica, String autor_letra, String disfraz) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_musica = autor_musica;
        this.autor_letra = autor_letra;
        this.disfraz = disfraz;
        numero_agrupaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor_musica() {
        return autor_musica;
    }

    public void setAutor_musica(String autor_musica) {
        this.autor_musica = autor_musica;
    }

    public String getAutor_letra() {
        return autor_letra;
    }

    public void setAutor_letra(String autor_letra) {
        this.autor_letra = autor_letra;
    }

    public String getDisfraz() {
        return disfraz;
    }

    public void setDisfraz(String disfraz) {
        this.disfraz = disfraz;
    }

    public void setNumero_agrupaciones(Integer numero_agrupaciones) {
        this.numero_agrupaciones = numero_agrupaciones;
    }

    public abstract void cantar_la_presentacion();

    public abstract void hacer_tipo();

    public static Integer getNumero_agrupaciones() {
        return numero_agrupaciones;
    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_musica='" + autor_musica + '\'' +
                ", autor_letra='" + autor_letra + '\'' +
                ", disfraz='" + disfraz + '\'' +
                ", numero_agrupaciones=" + numero_agrupaciones +
                '}';
    }
}


