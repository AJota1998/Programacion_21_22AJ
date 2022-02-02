package YOUTUBE.Persona;

public class Persona {

    //Atributos

    String nombre;
    int edad;
    String dni;

    //Métodos

    //Ejemplo de método constructor. (Único que no se pone valor de retorno es decir, ni void, ni int, ni nada)
    //podemos usar el mismo nombre de variable en el constructor y en los atributos, pero de esta manera tendremos
    //que diferenciarlos en el, usando this.
    public Persona(String _nombre, int _edad) {
        this.nombre = _nombre;
        this.edad = _edad;
    }

    //Creamos otro constructor con solo el parametro dni, esto es sobrecargar el constructor.
    //Un constructor se diferencia de otro por los PARAMETROS que se le pasan.
    public Persona(String _dni) {
        this.dni = _dni;
    }

    public void mostrar_datos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

    //creamos el método correr de esta manera
    public void correr() {
        System.out.println("Soy: " + nombre);
        System.out.println("Tengo: " + edad + " años");
        System.out.println("Y estoy corriendo una maratón");
    }
    //volvemos a crear un metodo correr pero con PARAMETROS diferentes, esto es sobrecargar el método
    public void correr(int km) {
        System.out.println("He corrido" + km + " kilómetros");
    }


}
