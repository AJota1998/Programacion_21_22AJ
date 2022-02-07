package YOUTUBE.Encapsulado;

public class clase1 {

    //creamos la variable edad de manera privada para que solo sea accesible por esta clase.
    private int edad;
    private String nombre;


    //el metodo setter lo que hace es que desde otra clase le podemos pasar el valor de la variable que aquí es privada.
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //devolvemos con un getter el valor de nuestra variable edad.
    public int getEdad() {
        return edad;
    }
}
