import appartement.AppareilAppart;
import appartement.AppareilAppartThermostat;
import thermos.Thermostat;

import java.awt.*;


public class AdapterAppartThermostat implements Appareil {

    private AppareilAppartThermostat t;
    public AdapterAppartThermostat(AppareilAppart t) {
        this.t = (AppareilAppartThermostat) t;
    }


    @Override
    public void allumer() {
        t.augmenterTemperature();
    }

    @Override
    public void eteindre() {
        t.baisserTemperature();
    }
}