package TEMA3.arrays;

import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int trimestre = 3;
        int alumnos = 5;


        int datos[][] = new int[trimestre][alumnos];

        for (int i = 0; i < trimestre; i++) {
            for (int j = 0; j < alumnos; j++) {
                System.out.println("Introduce la nota del trimestre " + (i+1) + " del alumno " + (j+1));
                datos [i][j] = teclado.nextInt();
            }
        }
        System.out.println("Introduce el trimestre del que desea saber la media 0, 1, 2");
        int tri = teclado.nextInt();


        int media = 0;
        for (int i = 0; i < alumnos ; i++) {
            media = media + datos[tri][i];
        }
        System.out.println("La media del trimestre " + tri + " es " + media / alumnos);

        System.out.println("Introduce el alumno que desea saber, 0, 1, 2, 3, 4");
        int numalu = teclado.nextInt();
        int medialumno = 0;

        for (int i = 0; i < trimestre; i++) {
            medialumno = medialumno + datos[numalu][i];
        }
        System.out.println("La media del alumno " + numalu + " es " + medialumno / trimestre);
    }
}
