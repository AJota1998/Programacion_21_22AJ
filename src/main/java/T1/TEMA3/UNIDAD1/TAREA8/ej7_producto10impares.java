package T1.TEMA3.UNIDAD1.TAREA8;

public class ej7_producto10impares {
    public static void main(String[] args) {

        int impares = 1;

        do {
            System.out.println("El producto de " + impares + " es: " + (impares * impares));
            impares += 2;
        } while (impares < 20);
    }
}
