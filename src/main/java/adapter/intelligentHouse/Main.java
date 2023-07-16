package adapter.intelligentHouse;

import adapter.intelligentHouse.deviceOfIntelligentHouse.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        List<IElementIH> elementIHS = new ArrayList<>();
        elementIHS.add(new AdapterKettle(new Kettle()));
        elementIHS.add(new AdapterRefrigerator(new Refrigerator()));
        elementIHS.add(new AdapterLights(new Lights()));

        elementIHS.forEach(IElementIH::turnDeviceOn);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        elementIHS.forEach(IElementIH::turnDeviceOff);
    }
}
