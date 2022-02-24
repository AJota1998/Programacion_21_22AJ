package U4U5Entregable21_22_Tarde;

public class Pelicula extends Multimedia implements Reproducible{

    private String director;
    private Double duracion;
    private String productora;
    private String pais;
    private int id_pelicula;

    public Pelicula(int anio_estreno, String titulo, String director, Double duracion, String productora, String pais) {
        super(anio_estreno, titulo);
        this.director = director;
        this.duracion = duracion;
        this.productora = productora;
        this.pais = pais;
        id_pelicula=numero_elementos;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "anio_estreno=" + anio_estreno +
                ", titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", productora='" + productora + '\'' +
                ", pais='" + pais + '\'' +
                ", id_pelicula=" + id_pelicula +
                '}';
    }

    @Override
    public void dar_por_finalizado() {
        super.dar_por_finalizado();
        System.out.println("El elemento '" + getTitulo() + "' ha finalizado");
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo película: " + getTitulo());
    }

    @Override
    public void pause() {
        System.out.println("Pausando película: " + getTitulo());
    }

    @Override
    public void stop() {
        System.out.println("Parando película " + getTitulo());
    }
}
