import thermos.Thermostat;

public class AdapterThermostat implements  Appareil{

    private Thermostat t;

    AdapterThermostat(Thermostat th) {
        this.t = th;
    }

    public void allumer() {
        t.monterTemperature();
    }


    public void eteindre() {
        t.baisserTemperature();
    }

    public String toString() {
        return "Thermostat:" + t;
    }

}
