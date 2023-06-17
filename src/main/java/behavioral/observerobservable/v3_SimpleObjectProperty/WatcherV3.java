package behavioral.observerobservable.v3_SimpleObjectProperty;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import lombok.AllArgsConstructor;
import lombok.Data;



@AllArgsConstructor
@Data
public class WatcherV3 implements ChangeListener<NewsV3> {
    private int poziomZainteresowania;
    private String name;


    @Override
    public void changed(ObservableValue<? extends NewsV3> observable, NewsV3 oldValue, NewsV3 newValue) {
        if (newValue.getPriorytet() > poziomZainteresowania) {
            System.err.println(newValue.getWiadomosc() + " - " + name + ": OMG! O nie!");
        } else {
            System.out.println(newValue.getWiadomosc() + " - " + name + ": Etam, co mie to...");
        }
    }
}
