package T1.TEMA3.UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej9_arbolAlto {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int alturaarbol = 0;
        int etiquetaarbol = 0;
        int arbolalto = 0;
        int etiarbolalto = 0;

        while (alturaarbol != -1) {
            System.out.println("Introduzca la altura en cm");
            alturaarbol = teclado.nextInt();
            if (alturaarbol > arbolalto) {
                arbolalto = alturaarbol;
                etiarbolalto = etiquetaarbol;
            }
            etiquetaarbol++;

        }
        System.out.println("El arbol más alto mide " + arbolalto  + " cm y su etiqueta es la " + etiarbolalto );

    }
}
