package UNIDAD5.ej9;

public class Television extends Electrodomestico {

    protected int pulgadas;
    protected boolean TDT;

    //c1
    public Television() {
        this.pulgadas = 20;
        this.TDT = false;
    }
    //c2
    public Television(Double preciobase, Double peso) {
        super(preciobase, peso);
        this.pulgadas = 20;
        this.TDT = false;
    }
    //c3
    public Television(Double preciobase, enumcol color, enumcons consumo, Double peso, int pulgadas, boolean TDT) {
        super(preciobase, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }
    //Getter and Setter
    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public Double getPrecio_final() {
        double incrementar = 0;
        if(pulgadas > 40) {
            incrementar = (getPrecio_final() * 0.3);
        }
        if(TDT) {
            incrementar += 50;
        }
        return super.getPrecio_final() + incrementar;
    }

    @Override
    public String toString() {
        return "Television{" +
                "preciobase=" + preciobase +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", pulgadas=" + pulgadas +
                ", TDT=" + TDT +
                ", precioFInal=" + getPrecio_final() +
                '}';
    }
}
