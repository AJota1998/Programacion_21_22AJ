package ZZZPRACTICAS.EJVIDEOJUEGO;


import java.util.Arrays;

public class Escenario {

        private int PixelSize;
        private int PixelLong;
        private int N_Anillos;
        private int N_Gemas;
        private String[] Tipo_Enemigos;
        private Enemigo[] Enemigos;
        private Enemigo enemigajo;
        private int indice;

        public Escenario(int PixelSize, int PixelLong, int N_Anillos, int N_Gemas){
            this.PixelSize=PixelSize;
            this.PixelLong=PixelLong;
            this.N_Anillos=N_Anillos;
            this.N_Gemas=N_Gemas;
        }
        public Escenario(String[] Tipo_Enemigos){
            this.PixelSize=100;
            this.PixelLong=100;
            this.N_Anillos=500;
            this.N_Gemas=2;
            this.Tipo_Enemigos=Tipo_Enemigos;
        }

        public void AgregoEnemigo(Enemigo enemigajo){
            if (indice<Enemigos.length){
                Enemigos[indice++]= enemigajo;
            } else {
                Enemigos= Arrays.copyOf(Enemigos, Enemigos.length+1);
                Enemigos[indice++]=enemigajo;
            }
        }

        public void info(){
            System.out.println("Información del escenario seleccionado:");
            System.out.println("Pixeles de altura: "+this.PixelSize);
            System.out.println("Pixeles de longitud: "+this.PixelLong);
            System.out.println("Nº de Anillos: "+this.N_Anillos);
            System.out.println("Nº de Gemas: "+this.N_Gemas);
            System.out.println("Tipos de enemigos:");
            for (int i = 0; i < Tipo_Enemigos.length; i++) {
                System.out.print(Tipo_Enemigos[i]+" ");
            }
            System.out.println("Enemigos:");
            for (int i = 0; i < Enemigos.length; i++) {
                System.out.print(Enemigos[i]+" ");
            }
        }
}
