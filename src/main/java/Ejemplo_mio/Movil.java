package Ejemplo_mio;

public class Movil extends Dispositivo {

    private String sistema_operativo;
    private Integer ranking;

    public Movil(String marca, String modelo, Double precio, String sistema_operativo, Integer ranking) {
        super(marca, modelo, precio);
        this.sistema_operativo = sistema_operativo;
        this.ranking = ranking;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
