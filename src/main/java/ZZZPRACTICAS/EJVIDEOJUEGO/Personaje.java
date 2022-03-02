package ZZZPRACTICAS.EJVIDEOJUEGO;

public class Personaje {
    private enum Personajes {
        Sonic,
        Tails,
        Knuckles
    }

    ;
    private Personajes pavo;
    private double PunioVel;
    private int HitDmg;
    private int KickDmg;

    public Personaje() {
        this.pavo = Personajes.Sonic;
        this.PunioVel = 100.0;
        this.HitDmg = 100;
        this.KickDmg = 200;
    }

    public Personaje(Personajes pavo, double PuniooVel, int HitDmg, int KickDmg) {
        this.pavo = pavo;
        this.PunioVel = PunioVel;
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
        System.out.println("Velocidad: " + this.PunioVel);
        System.out.println("Daño de puñetazo: " + this.HitDmg);
        System.out.println("Daño de patada: " + this.KickDmg);
    }
}
