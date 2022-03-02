package ZZZPRACTICAS.REPASO;

public class persona extends personas{

    ////////////////////// VARIABLES --------------------------------------

    protected String nif;
    protected Integer edad;
    protected String nombre;
    protected Integer alturaCm;
    protected Double peso;
    protected Boolean tieneGafas;

    // -------------------------------------------------
    protected Double IMC;
    protected Integer dni;

    // -------------------------------------------------
    protected static Integer contadorPersonas = 0;
    // -------------------------------------------------


    public enum enumColorPelo {
        Moreno,
        Rubio,
        Pelirrojo,
        Negro,
        Blanco
    }

    protected enumColorPelo colorPelo;

    ////////////////////// CONSTRUCTORES --------------------------------------

    public persona(String nif, Integer edad, String nombre, Integer alturaCm, Double peso, Boolean tieneGafas, enumColorPelo colorPelo) {
        this.nif = nif;
        this.edad = edad;
        this.nombre = nombre;
        this.alturaCm = alturaCm;
        this.peso = peso;
        this.tieneGafas = tieneGafas;
        this.colorPelo = colorPelo;
        this.IMC = calculaIMC();
        this.dni = obtenerNIF();
        contadorPersonas++;
    }

    public persona() {
        this.nif = "75777113w";
        this.edad = 31;
        this.nombre = "Adrián";
        this.alturaCm = 186;
        this.peso = 72.5;
        this.tieneGafas = true;
        this.colorPelo = enumColorPelo.Moreno;
        this.IMC = calculaIMC();
        this.dni = obtenerNIF();
        contadorPersonas++;
    }

    ////////////////////// MÉTODOS --------------------------------------

    public Double calculaIMC() {

        Double alturaM = Double.valueOf(alturaCm);
        Double alturaM2 = (alturaM / 100) * (alturaM / 100);

        this.IMC = this.peso / alturaM2;

        return IMC;
    }

    public Integer obtenerNIF() {

        this.dni = Integer.valueOf(this.nif.substring(0,8));

        return dni;
    }

    @Override
    public String toString() {
        return "persona{" +
                "nif='" + nif + '\'' +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", alturaCm=" + alturaCm +
                ", peso=" + peso +
                ", tieneGafas=" + tieneGafas +
                ", IMC=" + IMC +
                ", dni=" + dni +
                ", colorPelo=" + colorPelo +
                '}';
    }

    ////////////////////// MÉTODOS --------------------------------------

    ////////////////////// GETTERS AND SETTERS --------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}
