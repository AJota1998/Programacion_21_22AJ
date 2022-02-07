package UNIDAD5.ej5Yej6;

import java.util.Arrays;

public class Piano extends Instrumento {

    private String tipo_piano;

    public Piano(String tipo_piano) {
        this.tipo_piano = tipo_piano;
    }

    @Override
    public void interpretar() {
        System.out.println(Arrays.toString(getNotasArray()));
    }
}
