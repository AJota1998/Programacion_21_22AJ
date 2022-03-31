package U6U7_EXAMEN2122_TARDE;


import java.io.Serializable;
import java.util.Objects;

public class Pelicula implements Serializable {

    private String titulo;
    private String anio_estreno;
    private String pais;
    private String director;
    private String genero;
    private Integer id;
    public static Integer contadorpelis = 1;

    public Pelicula(String titulo, String anio_estreno, String pais, String director, String genero) {
        this.titulo = titulo;
        this.anio_estreno = anio_estreno;
        this.pais = pais;
        this.director = director;
        this.genero = genero;
        this.id = contadorpelis++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio_estreno() {
        return anio_estreno;
    }

    public void setAnio_estreno(String anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }

    public static Integer getContadorpelis() {
        return contadorpelis;
    }

    @Override
    public String toString() {
        return "Pelicula " +
                "titulo'" + titulo + '\'' +
                ", año'" + anio_estreno + '\'' +
                ", pais'" + pais + '\'' +
                ", director'" + director + '\'' +
                ", genero'" + genero + '\'' +
                ", id " + id +
                '}';
    }

}
