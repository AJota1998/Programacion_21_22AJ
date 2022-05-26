package T1.TEMA3.UNIDAD1.TAREA8;

import java.util.Scanner;

public class ej3_numerosAleatorios {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int maquina = (int) (1 + Math.random() * 100);
        int usuario;

        do {
            System.out.println("Introduzca un número a ver si tiene suerte");
            usuario = teclado.nextInt();
            if (usuario > maquina) {
                System.out.println("Casi, el número es menor");
            } else  if (usuario < maquina){
                System.out.println("Casi, el número es mayor");
            }

        } while (maquina != usuario || usuario == -1);

        System.out.println("Número de la máquina: " + maquina);
        System.out.println("Número introducido por el jugador: " + usuario);
        System.out.println("¡Enhorabuena!");
    }
}
