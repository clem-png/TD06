import appartement.AppareilAppartHifi;

public class AdapterAppareilAppartHifi implements Appareil{

    private AppareilAppartHifi a;

    private int son = 0;

    public AdapterAppareilAppartHifi(AppareilAppartHifi app) {
        this.a = app;
    }

    public void allumer() {
        this.son += 10;
        if (this.son > 100){
            this.son = 100;
        }

        a.changerSon(son);
    }

    public void eteindre() {
        this.son = 0;
        a.changerSon(son);
    }

    public String toString() {
        return "AppareilAppartHifi:" + a;
    }
}
