package ZZZPRACTICAS.EJVIDEOJUEGO;

public class Enemigo {
    enum Tipo {
        BuzzBomber,
        CrabMeat,
        Coconuts,
        Chopper,
        MotoBug
    }
    private Tipo tipejo;
    private int HP_Points;
    private int Dmg_Points;


    public Enemigo(Tipo tipejo){
        this.tipejo=tipejo;
        this.HP_Points=100;
        this.Dmg_Points=70;
    }

    public Enemigo(Tipo tipejo,int HP_Points, int Dmg_Points){
        this.tipejo=tipejo;
        this.HP_Points=HP_Points;
        this.Dmg_Points=Dmg_Points;
    }

    public void HITRESTAVIDA (int dmg){
        HP_Points-=dmg;
        if (HP_Points<=0){HP_Points=0;
            System.out.println("Has matado al enemigo");
        }
    }

    public void KICKRESTAVIDA (int dmg){
        HP_Points-=dmg;
        if (HP_Points<=0){HP_Points=0;
            System.out.println("Has matado al enemigo");
        }
    }

    public String info(){
        String informasion= "HP restante: "+this.HP_Points+" HP, "+"Daño: "+this.Dmg_Points+", "+"Tipo: "+ this.tipejo;
        return informasion;
    }
}
