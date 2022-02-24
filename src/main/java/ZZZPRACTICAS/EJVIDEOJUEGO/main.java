package ZZZPRACTICAS.EJVIDEOJUEGO;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personaje p1 = new Personaje();
        //Escenario e1 = new Escenario();
        Enemigo e1 = new Enemigo(Enemigo.Tipo.BuzzBomber,300,100);

        System.out.println("Ataca al enemigo:");
        e1.info();
        System.out.println("1-Puñetazo 2-Patada");
        int decision = sc.nextInt();
        if (decision==1){
            e1.HITRESTAVIDA(p1.getHitDmg());
        }else if (decision==2){
            e1.KICKRESTAVIDA(p1.getKickDmg());
        }
        System.out.println(e1.info());
    }
}
