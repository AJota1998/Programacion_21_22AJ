package UNIDAD1.TAREA8;

public class ej11_tablaMultiplicar1a10 {
    public static void main(String[] args) {

        for (int i = 1; i < 11 ; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j < 11 ; j++) {
                System.out.println(i + " x " + j + " " + (i*j));
            }
        }
    }
}
