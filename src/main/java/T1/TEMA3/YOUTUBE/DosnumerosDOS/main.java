package T1.TEMA3.YOUTUBE.DosnumerosDOS;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca n1");
        int n1 = teclado.nextInt();
        System.out.println("Introduzca n2");
        int n2 = teclado.nextInt();

        Operacion op = new Operacion();

        // estamos pasando ARGUMENTOS para llamar a estos métodos
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.resultados();
    }
}
