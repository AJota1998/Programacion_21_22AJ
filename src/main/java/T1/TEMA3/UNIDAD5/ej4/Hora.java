package T1.TEMA3.UNIDAD5.ej4;

public class Hora {

    //Atributos
    private int hora;
    private int minuto;

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    //constructor que limitamos el valor que podemos introducir para las variables.
    public Hora (int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }
    //limitamos el número que desde fuera podemos darle de valor a la variable
    public void setHora(int hora) {
       if(hora >= 0 && hora <= 23) {
           this.hora = hora;
       }
    }
    //exactamente lo mismo que con el otro atributo
    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <= 59)
        this.minuto = minuto;
    }

    //Métodos

    //mostrar hora actual
    public void mostrar_hora() {
        System.out.println("Son las: " + hora + " horas " + minuto + " minutos");
    }

    //incrementar hora en un minuto
    public void incrementar_hora() {
        this.minuto++;
        mostrar_hora();
    }

    //metodo toString que imprime en un String los valores de los atributos que pasemos
    @Override
    public String toString() {
        return hora + ":" + minuto;
    }
}
