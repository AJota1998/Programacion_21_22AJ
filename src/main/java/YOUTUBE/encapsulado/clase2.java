package YOUTUBE.encapsulado;

public class clase2 {
    public static void main(String[] args) {


        clase1 objeto1 = new clase1();

        //le pasamos el valor que queramos desde aquí a la variable edad de la clase1
        //lo hacemos de esta manera porque es un ejemplo de encapsulamiento.
        objeto1.setEdad(10);

        //obtenemos el valor de la edad de la clase1 llamando al metodo getter de la clase
        //lo hacemos así porque es otro ejemplo de encapsulamiento.
        System.out.println("La edad es: " + objeto1.getEdad());

        }

    }
