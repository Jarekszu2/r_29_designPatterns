package behavioral.observerobservable.v2_Observer;

import java.util.Observable;
import java.util.Observer;

public class AnyClass2 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof NewsV2) {
            NewsV2 newsV2 = (NewsV2) arg;
            System.out.println("AnyClass: " + newsV2);
        } else {
            System.out.println("Nie kumam, co to jest: " + arg);
        }
    }
}
