package home;

import people.Person;

public class Home {
    protected Atmosphere atmosphere;
    protected double temperature;

    public Home(Atmosphere atmosphere, double temperature) {
        this.atmosphere = atmosphere;
        this.temperature = temperature;
    }

    public void updateAtmosphere(Atmosphere newAtmosphere) {
        atmosphere = newAtmosphere;
    }

    public void updateTemperature(double temp) {
        temperature = temp;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public double getTemperature() {
        return temperature;
    }
}