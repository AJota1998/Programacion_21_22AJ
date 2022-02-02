package YOUTUBE.Persona;

public class main {
    public static void main(String[] args) {

        //Como hemos creado un constructor en la clase Persona con dos PARAMETROS, nombre y edad
        //al crear el objeto de ese tipo tenemos que pasarles los valores de nombre y edad.
        Persona p1 = new Persona("Alejandro", 21);

        //llamamos al método mostrar_datos el cual guarda en sus variables los valores que hemos introducido
        //para realizar sus operaciones y mostrar el resultado.
        p1.mostrar_datos();


        //SOBRECARGA

        //creamos el objeto persona 1 con los parametros del primer constructor, nombre y edad.
        Persona persona1 = new Persona("Alejandro", 21);

        //llamamos al método correr que no tiene PARAMETROS.
        persona1.correr();

        //creamos otro objeto persona 2, con los paramétros del segundo constructor, dni
        Persona persona2 = new Persona("12345678A");

        //llamamos al método correr que tiene el PARAMETRO km y se lo pasamos.
        persona2.correr(100);
    }
}
