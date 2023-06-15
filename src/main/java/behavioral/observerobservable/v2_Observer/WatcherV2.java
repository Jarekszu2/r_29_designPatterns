package behavioral.observerobservable.v2_Observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@AllArgsConstructor
@Data
public class WatcherV2 implements Observer {
    private int poziomZainteresowania;
    private String name;

    @Override
    public void update(Observable o, Object arg) {  // Observable o - to jest newsStation
        if (arg instanceof NewsV2){
            NewsV2 newsV2 = (NewsV2) arg;
            if (newsV2.getPriorytet() > poziomZainteresowania) {
                System.err.println(name + ": OMG! O nie! " + newsV2.getWiadomosc());
            } else {
                System.out.println(name + ": Etam, co mie to... - " + newsV2.getWiadomosc());
            }
        } else {
            System.out.println("Nie kumam, co to jest: " + arg);
        }
    }
}
