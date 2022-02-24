package U4U5Entregable21_22_Tarde;

public class Libro extends Multimedia implements Reproducible{

    private String autor;
    private String editorial;
    private Integer isbn;
    private int n_paginas;
    private int id_libro;

    public Libro(int anio_estreno, String titulo, String autor, String editorial, Integer isbn, int n_paginas) {
        super(anio_estreno, titulo);
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
        this.n_paginas = n_paginas;
        id_libro=numero_elementos;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn=" + isbn +
                ", n_paginas=" + n_paginas +
                ", id_libro=" + id_libro +
                ", anio_estreno=" + anio_estreno +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public void dar_por_finalizado() {
        super.dar_por_finalizado();
        System.out.println("El elemento: '" + getTitulo() + "' ha finalizado");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo libro: " + getTitulo());
    }

    @Override
    public void pause() {
        System.out.println("Pausando libro: " + getTitulo());
    }

    @Override
    public void stop() {
        System.out.println("Parando libro: " + getTitulo());
    }
}
