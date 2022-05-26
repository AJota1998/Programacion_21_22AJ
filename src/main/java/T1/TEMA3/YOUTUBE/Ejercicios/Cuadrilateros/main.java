package T1.TEMA3.YOUTUBE.Ejercicios.Cuadrilateros;

import java.util.Scanner;

//calcular el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados.
//Los valores de la longitud deberán introducirse por teclado.
//Si se trata de un cuadrado, solo se proporcionara el valor de uno de sus lados al constuctor, ya que son iguales.

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Cuadrilatero cuadri1;

        float lado1,lado2;

        System.out.println("Introduzca el valor del lado 1");
        lado1 = teclado.nextFloat();
        System.out.println("Introduzca el valor del laado 2");
        lado2 = teclado.nextFloat();

        if(lado1 == lado2) {
            cuadri1 = new Cuadrilatero(lado1);
        } else {
            cuadri1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El área es: " + cuadri1.getArea());
        System.out.println("El perímetro es: " + cuadri1.getPerimetro());
    }
}
