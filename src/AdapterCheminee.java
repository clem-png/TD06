public class AdapterCheminee implements Appareil {

    public Cheminee c;
    public AdapterCheminee(Cheminee che) {
        this.c = che;
    }

    public void allumer() {
        c.intensite += 10;
    }

    public void eteindre() {
        c.intensite = 0;
    }

    public String toString() {
        return "Cheminee:" + c.intensite;
    }
}
