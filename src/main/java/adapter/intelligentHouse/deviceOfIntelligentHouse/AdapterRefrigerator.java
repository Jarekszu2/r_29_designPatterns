package adapter.intelligentHouse.deviceOfIntelligentHouse;

import adapter.intelligentHouse.IElementIH;

public class AdapterRefrigerator implements IElementIH {
    private final Refrigerator refrigerator;

    public AdapterRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    @Override
    public void turnDeviceOn() {
        refrigerator.on();
    }

    @Override
    public void turnDeviceOff() {
        refrigerator.off();
    }
}
