import appartement.AppareilAppartLampe;

public class AdapterAppartLumiere implements Appareil {

    private AppareilAppartLampe a;
    private String lieu;

    public AdapterAppartLumiere(AppareilAppartLampe app, String l) {
        this.a = app;
        this.lieu = l;
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
