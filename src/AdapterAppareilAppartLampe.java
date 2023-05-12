import appartement.AppareilAppartLampe;

public class AdapterAppareilAppartLampe implements Appareil {

    private AppareilAppartLampe a;

    public AdapterAppareilAppartLampe(AppareilAppartLampe app) {
        this.a = app;
    }

    public void allumer() {
        a.allumer();
    }

    public void eteindre() {
        a.eteindre();
    }

    public String toString() {
        return "AppareilAppartLampe:" + a;
    }


}
