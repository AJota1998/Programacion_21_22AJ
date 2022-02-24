package ZZZPRACTICAS.EJVIDEOJUEGO;

public class Personaje {
    private enum Personajes {
        Sonic,
        Tails,
        Knuckles
    }

    ;
    private Personajes pavo;
    private double PuñoVel;
    private int HitDmg;
    private int KickDmg;

    public Personaje() {
        this.pavo = Personajes.Sonic;
        this.PuñoVel = 100.0;
        this.HitDmg = 100;
        this.KickDmg = 200;
    }

    public Personaje(Personajes pavo, double PuñoVel, int HitDmg, int KickDmg) {
        this.pavo = pavo;
        this.PuñoVel = PuñoVel;
        this.HitDmg = HitDmg;
        this.KickDmg = KickDmg;
    }

    public int getHitDmg() {
        return HitDmg;
    }

    public int getKickDmg() {
        return KickDmg;
    }

    public void info() {
        System.out.println("Información del personaje seleccionado:");
        System.out.println("Personaje: " + this.pavo);
        System.out.println("Velocidad: " + this.PuñoVel);
        System.out.println("Daño de puñetazo: " + this.HitDmg);
        System.out.println("Daño de patada: " + this.KickDmg);
    }
}
