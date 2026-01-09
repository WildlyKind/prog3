package people;

import items.Fireplace;
import home.*;

public class Magic {
    public void makeFire(Fireplace fireplace, Home home) {
        fireplace.ignite();
        home.updateTemperature(home.getTemperature() + 2.0);
        home.updateAtmosphere(Atmosphere.ILLUMINATION);
    }
}