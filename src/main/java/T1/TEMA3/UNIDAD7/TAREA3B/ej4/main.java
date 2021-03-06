package T1.TEMA3.UNIDAD7.TAREA3B.ej4;
/*
Actividad 4: Crea una clase llamada Traductor,
que contenga un atributo llamado "diccionario" de tipo HashMap y se comporte de esta forma:
Al crear el objeto Traductor, el atributo diccionario debe ser cargado con
la información de un archivo de texto cuyo nombre se le pasará por parámetro al constructor.
Este archivo debe contener varias palabras en español y su traducción al inglés,
de tal forma que las palabras en español sean la clave, y las que estén en inglés, el valor. Por ejemplo:

hola, hello
mundo, world
gracias, thanks
adios, bye
Crear un método que reciba una palabra o una frase, y devuelva la cadena traducida al inglés.
 */
public class main {
    public static void main(String[] args) {

    Traductor t1 = new Traductor("ficheros/diccionario.txt");

        System.out.println(t1.traduce("hola"));
        //imprimir de otra forma
        t1.imprime();

        System.out.println(t1.traduce_frase("hola yo soy guapo adios"));
    }
}
