package T1.TEMA3.UNIDAD5.ej5Yej6;

public class main {
    public static void main(String[] args) {

        Piano piano1 = new Piano("cola");

        piano1.add(Instrumento.notasEnum.SI);
        piano1.add(Instrumento.notasEnum.MI);
        piano1.add(Instrumento.notasEnum.SI);
        piano1.add(Instrumento.notasEnum.FA);
        piano1.add(Instrumento.notasEnum.SI);
        piano1.add(Instrumento.notasEnum.RE);
        piano1.add(Instrumento.notasEnum.LA);

        piano1.interpretar();

    }
}
