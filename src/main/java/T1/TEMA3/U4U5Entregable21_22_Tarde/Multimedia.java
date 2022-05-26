package T1.TEMA3.U4U5Entregable21_22_Tarde;

public abstract class Multimedia {

    protected int anio_estreno;
    protected String titulo;
    protected static int numero_elementos = 0;
    protected int identificador = 0;

    public Multimedia(int anio_estreno, String titulo) {
        this.anio_estreno = anio_estreno;
        this.titulo = titulo;
        numero_elementos++;
    }

    public void dar_por_finalizado() {}

    public int compareTo(Object o) {
        if (!(o instanceof Multimedia)) {
            return 0;
        }
        Multimedia that = (Multimedia) o;
        return this.identificador - that.identificador;
    }
}
