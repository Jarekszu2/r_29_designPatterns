package behavioral.observerobservable.v3_SimpleObjectProperty;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class AnyClass3 implements ChangeListener<NewsV3> {


    @Override
    public void changed(ObservableValue<? extends NewsV3> observable, NewsV3 oldValue, NewsV3 newValue) {
        System.out.println("AnyClass: ! " + newValue);
    }
}
