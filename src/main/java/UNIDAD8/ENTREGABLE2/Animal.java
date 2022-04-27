package UNIDAD8.ENTREGABLE2;

public class Animal {

    private String nombre;
    private String edad;
    private String raza;
    private String colorpiel;

    public Animal(String nombre, String edad, String raza, String colorpiel) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.colorpiel = colorpiel;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", raza='" + raza + '\'' +
                ", colorpiel='" + colorpiel + '\'' +
                '}';
    }
}
