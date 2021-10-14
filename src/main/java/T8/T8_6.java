package T8;

public class T8_6 {
    public static void main(String[] args) {

        int numero = 7;
        int multiplo = 0;
        int resultado = 0;

        do {
            resultado = (numero * multiplo);
            System.out.println(resultado);
            multiplo++;
        } while (resultado < 97);
    }
}

