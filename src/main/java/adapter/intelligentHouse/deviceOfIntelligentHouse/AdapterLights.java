package adapter.intelligentHouse.deviceOfIntelligentHouse;

import adapter.intelligentHouse.IElementIH;

public class AdapterLights implements IElementIH {
    private final Lights lights;

    public AdapterLights(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void turnDeviceOn() {
        lights.turnOn();
    }

    @Override
    public void turnDeviceOff() {
        lights.turnOff();
    }
}
