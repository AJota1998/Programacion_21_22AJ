package T1.TEMA3.UNIDAD4.ej1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //creamos la cuenta corriente

        System.out.println("Introduzca el nombre completo");
        String nom_cli = teclado.nextLine();
        System.out.println("Introduzca el DNI");
        String DNI = teclado.next();

        cuenta_corriente c1 = new cuenta_corriente(nom_cli, DNI);

        //sacar dinero

        System.out.println("Introduzca la cantidad que desea retirar");
        int cantidad = teclado.nextInt();

        c1.sacar_dinero(cantidad);

        //Ingresar dinero

        System.out.println("Introduzca la cantidad a ingresar");
        int ingresar = teclado.nextInt();

        c1.ingresar_dinero(ingresar);

        //mostrar informacion de la cuenta

        c1.informacion();


    }
}
