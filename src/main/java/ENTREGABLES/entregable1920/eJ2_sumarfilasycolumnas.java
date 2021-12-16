package ENTREGABLES.entregable1920;

public class eJ2_sumarfilasycolumnas {

    public static void main(String[] args) {

        int [][]n = new int[4][5]; //Matriz para generar los números aleatorios entre 0 y 100
        int [][]nArray = new int[5][6]; //Array Final
        int total = 0;

        //Genera los números aleatorios

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = (int) (Math.random() * 101);
                nArray[i][j] = n[i][j];
                total += nArray[i][j]; // Sumamos para obtener el total
            }
        }

        // Sumar filas

        for (int i = 0; i < nArray.length - 1; i++) {
            int suma = 0;
            for (int j = 0; j < nArray[i].length - 1; j++) {
                suma += nArray[i][j];
            }
            nArray[i][n[i].length] = suma; // Asignamos en la ultma posicion de j (columnas)
        }

        // Sumar columnas

        for (int i = 0; i < nArray.length; i++) {
            int suma = 0;
            for (int j = 0; j < nArray[i].length - 1; j++) {
                suma += nArray[j][i]; // Invertimos las posiciones para poder sumar de forma horizontal
            }
            nArray[n.length][i] = suma;
        }

        // A la ultma posición se agrega el total

        nArray[nArray.length - 1][nArray[0].length - 1] = total;

        // Mostramos la matriz

        for (int[] definitivo : nArray) {
            for (int i = 0; i < definitivo.length; i++) {
                System.out.print(definitivo[i] + ", ");
                if (nArray.length == i)
                    System.out.println();
            }
        }
    }
}
