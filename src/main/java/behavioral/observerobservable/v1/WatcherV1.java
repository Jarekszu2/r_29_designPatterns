package behavioral.observerobservable.v1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WatcherV1 implements IWatcher{
    private int poziomZainteresowania;
    private String imie;


    @Override
    public void update(NewsV1 newsV1) {
        if (newsV1.getPriorytet() > poziomZainteresowania) {
            System.err.println(imie + ": OMG! O nie! " + newsV1.getWiadomosc());
        } else {
            System.out.println(imie + ": Etam, co mie to... - " + newsV1.getWiadomosc());
        }
    }
}
