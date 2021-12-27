package UNIDAD1.TAREA7;

public class ej3_letraminusAleatoria {
    public static void main(String[] args) {

        char letra = (char)(Math.random() * 26 + 'a');
        System.out.println("la letra aleatoria es la " + letra);
    }
}
