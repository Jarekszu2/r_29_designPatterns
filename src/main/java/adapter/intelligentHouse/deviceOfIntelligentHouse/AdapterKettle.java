package adapter.intelligentHouse.deviceOfIntelligentHouse;

import adapter.intelligentHouse.IElementIH;

public class AdapterKettle implements IElementIH {
    private final Kettle kettle;

    public AdapterKettle(Kettle kettle) {
        this.kettle = kettle;
    }

    @Override
    public void turnDeviceOn() {
        kettle.uruchomSie();
    }

    @Override
    public void turnDeviceOff() {
        kettle.zamknijSie();
    }
}
