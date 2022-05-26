package T1.TEMA3.UNIDAD5.ej9;

import java.util.Comparator;

//estamos ordenando según el precio final
public class compararLavadoraPrecioFInal implements Comparator {
    @Override
    public int compare(Object o, Object t1) {
        if(!(o instanceof Lavadora)) {
            return 0;
        }
        if(!(t1 instanceof Lavadora )) {
            return 0;
        }
        Lavadora l1 = (Lavadora) o;
        Lavadora l2 = (Lavadora) t1;

        return (int) (l1.getPrecio_final()-l2.getPrecio_final());
    }
}
