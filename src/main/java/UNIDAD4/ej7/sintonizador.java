package UNIDAD4.ej7;

public class sintonizador {

    private double inicio = 80;

    private double fin = 108;

    public double freq;

    public double nuevafreq;

    // el constructor siempre se tiene que llamar igual que la clase
    public sintonizador(double frequsu) {
        this.freq = frequsu;
    }

    public void informacion() {
        System.out.println("La frecuencia de inicio es " + inicio);
        System.out.println("La frecuencia máxima es " + fin);
        System.out.println("Su frecuencia introducida es " + freq);
    }

    // metodo para el movimiento
    public void movimientos(String movimiento) {
        if(movimiento.equalsIgnoreCase("up") && freq >= inicio && freq < fin) {
            freq += 0.5;
        } else if (movimiento.equalsIgnoreCase("down") && freq > inicio && freq <= fin) {
            freq -= 0.5;
        } else if (movimiento.equalsIgnoreCase("up") && freq == fin) {
            freq = inicio;
        } else if (movimiento.equalsIgnoreCase("down") && freq == inicio) {
            freq = fin;
        }
        else {
            System.out.println("Palabra errónea, sistema craqueado, :( introduzca exit para salir");
            freq = 0;
        }
        System.out.println("La nueva frecuencia es: " + freq);
    }
}
