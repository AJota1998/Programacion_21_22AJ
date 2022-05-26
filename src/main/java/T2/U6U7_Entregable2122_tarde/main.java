package T2.U6U7_Entregable2122_tarde;

public class main {
    public static void main(String[] args) {

        Exchange ex1 = new Exchange("EX1");

        Criptomoneda cripto1 = new Criptomoneda("Bitcoin", "BTC", 10.56, 150.0, "10-01-2012", 1);
        Criptomoneda cripto2 = new Criptomoneda("Ethereum", "ETC", 23.98, 115.67, "12-07-2019", 3);
        Criptomoneda cripto3 = new Criptomoneda("Cardano", "CRD", 9.12, 180.90, "10-10-2020", 8);
        Criptomoneda cripto4 = new Criptomoneda("Alpinecoin", "APC", 21.0, 140.0, "23-11-2021", 2);
        Criptomoneda cripto5 = new Criptomoneda("PutinCoin", "PTC", 34.56, 110.89, "26-09-2021", 5);

        Fiat moneda1 = new Fiat("Euro", "EU", "Belgica");
        Fiat moneda2 = new Fiat("Dolar", "USD", "EEUU");
        Fiat moneda3 = new Fiat("Yuan", "YU", "Japon");
        Fiat moneda4 = new Fiat("Rupias", "RUP", "Vietnam");
        Fiat moneda5 = new Fiat("Marcos", "MRC", "Alemania");

        ParCotizacion par1 = new ParCotizacion(cripto1, cripto2, 23.50, 10.0);
        ParCotizacion par2 = new ParCotizacion(moneda1, cripto2, 12.78, 12.0);
        ParCotizacion par3 = new ParCotizacion(cripto2, moneda3, 56.89, 20.0);
        ParCotizacion par4 = new ParCotizacion(cripto1, moneda4, 45.87, 21.90);
        ParCotizacion par5 = new ParCotizacion(cripto4, moneda5, 12.56, 11.80);

        ex1.addCotizacion(par1);
        ex1.addCotizacion(par2);
        ex1.addCotizacion(par3);
        ex1.addCotizacion(par4);
        ex1.addCotizacion(par5);
        System.out.println();

        ex1.mostrarDivisasOrdenadas();
        System.out.println();

        ex1.guardarCotizaciones();
        System.out.println();

        ex1.recuperarCotizaciones();



    }


}
