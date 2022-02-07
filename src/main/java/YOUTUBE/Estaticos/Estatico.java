package YOUTUBE.Estaticos;

public class Estatico {

    //si creamos de manera static esta variable pasa a ser de la clase y no del objeto, lo cual
    //hace que para todos los objetos sea la misma mientra no se cambie desde otro objeto, de ser así
    //cambiará para todos los demás.
    private static String frase = "Primera Frase";

    //estamos creando un método estático de clase, que funciona igual que una variable, es propio de la clase
    public static int suma(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {

        Estatico obj1 = new Estatico();
        Estatico obj2 = new Estatico();

        obj2.frase = "Segunda frase";

        //si no cambiamos el valor para el objeto 2 al imprimirlo nos imprime lo mismo que para el objeto 1
        //cada objeto hace una copia diferente de lo que no sea estatico de la clase

        System.out.println(obj1.frase);
        System.out.println(obj2.frase);

        //sin necesidad de crear un objeto podemos llamar a la frase, puesto que es una variable estática de
        //la clase, no de un objeto de esta clase.
        System.out.println(Estatico.frase);

        System.out.println("La suma es: " + Estatico.suma(4, 8));

    }
}
