package UNIDAD7.TAREA4;

public class Empleado extends Persona {

    private Double sueldo;

    public Empleado(String nombre, String dni, Integer edad, Double estatura, Double sueldo) {
        super(nombre, dni, edad, estatura);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldo=" + sueldo +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                '}';
    }
} 
