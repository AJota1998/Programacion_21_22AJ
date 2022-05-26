package T1.TEMA3.U4U5Entregable21_22_Tarde;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible{

    private String creador;
    private int n_temporadas;

    private String[] capitulo = new String[1];
    private int indice = 0;
    private int id_serie;

    public Serie(int anio_estreno, String titulo, String creador, int n_temporadas) {
        super(anio_estreno, titulo);
        this.creador = creador;
        this.n_temporadas = n_temporadas;
        id_serie=numero_elementos;
    }

    public void addcapitulo(String nombrecap) {
        capitulo[indice] = nombrecap;
        indice++;
        capitulo = Arrays.copyOf(capitulo, capitulo.length+1);
    }

    public boolean eliminar_capitulo(String nombrecap) {
        for (int i = 0; i < capitulo.length; i++) {
            if(nombrecap.equals(capitulo[i])) {
                capitulo[i] = null;
                Arrays.copyOf(capitulo, capitulo.length-1);
                return true;
            }
        }
        return false;
    }

    @Override
    public void dar_por_finalizado() {
        super.dar_por_finalizado();
        System.out.println("El elemento: '" + getTitulo() + "' ha finalizado");
    }

    @Override
    public String toString() {
        return "Serie{" +
                "anio_estreno=" + anio_estreno +
                ", titulo='" + titulo + '\'' +
                ", creador='" + creador + '\'' +
                ", n_temporadas=" + n_temporadas +
                ", capitulo=" + Arrays.toString(capitulo) +
                ", indice=" + indice +
                ", id_serie=" + id_serie +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getN_temporadas() {
        return n_temporadas;
    }

    public void setN_temporadas(int n_temporadas) {
        this.n_temporadas = n_temporadas;
    }

    @Override
    public void play() {
        System.out.println("Parando serie: " + getTitulo() + " capítulo: " + capitulo_aleatorio());
    }

    @Override
    public void pause() {
        System.out.println("Pusando serie: " + getTitulo() + " capítulo: " + capitulo_aleatorio());
    }

    @Override
    public void stop() {
        System.out.println("Parando serie: " + getTitulo() + " capítulo: " + capitulo_aleatorio());
    }

    public String capitulo_aleatorio () {
        String capi="";
        int indice = (int) (1 + (Math.random() * capitulo.length - 1));

        capi = capitulo[indice];
        return capi;
    }
}
