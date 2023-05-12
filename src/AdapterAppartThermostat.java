import appartement.AppareilAppart;
import appartement.AppareilAppartThermostat;
import thermos.Thermostat;


public class AdapterAppartThermostat implements Appareil {

    private AppareilAppartThermostat t;
    public AdapterAppartThermostat(AppareilAppart t) {
        this.t = (AppareilAppartThermostat) t;
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