import appartement.AppareilAppartLampe;

public class AdapterAppartLampe implements Appareil {

    private AppareilAppartLampe a;

    public AdapterAppartLampe(AppareilAppartLampe app) {
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
