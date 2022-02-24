package ZZZPRACTICAS.EJ_MAINCRAFT;

public class Main {
    public static void main(String[] args) {

        Cristal c1 = new Cristal("Panel",70,20,30,true, Cristal.tipoo.TRANSLUCIDO);
        Roca r1 = new Roca("Pedrusco",100,30,80,true,50);
        Metal m1 = new Metal("Hierro",100,30,90,false,true);
        Cristal c2 = new Cristal("Suelo",20,10,90,false, Cristal.tipoo.TRANSPARENTE);
        Roca r2 = new Roca("Adoquín",40,30,100,true,10);
        Metal m2 = new Metal("Cobre",70,40,10,true,false);
        Cristal c3 = new Cristal("Rubí",70,20,30,true, Cristal.tipoo.TRANSLUCIDO);

        pico p1 = new pico("Pico de diamante",80,100,100,true,50);
        Sierra s1 = new Sierra("Sierra de oro",10,100,100,true,30);

        p1.Hacer(c1);
        p1.Deshacer(c2);
        p1.Deshacer(r2);
        p1.Deshacer(r1);
        p1.Deshacer(m1);
        p1.Deshacer(m2);
        p1.Hacer(c1);
        p1.Hacer(r1);
        p1.Hacer(c1);
        p1.Hacer(r2);
        p1.Hacer(m2);

        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(m1.toString());
        System.out.println(p1.toString());
        System.out.println(s1.toString());

        c1.MezclarConMaterial(c3);
        c1.MezclarConMaterial(c1);
        c1.MezclarConMaterial(m1);
    }
}
