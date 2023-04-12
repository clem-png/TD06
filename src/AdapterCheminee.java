public class AdapterCheminee implements Appareil {

    private Cheminee c;
    public AdapterCheminee(Cheminee che) {
        this.c = che;
    }

    public void allumer() {
        int k = c.getLumiere();
        c.changerIntensite(k + 10);
    }

    public void eteindre() {
        c.changerIntensite(0);
    }

    public String toString() {
        return "Cheminee:" + c.intensite;
    }
}
