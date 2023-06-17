package behavioral.observerobservable.v3_SimpleObjectProperty;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;


// w tym podejściu zmieniemy typ informacji, która ma być rozgłoszona: zamiast News -> SimpleObjectProperty<News>
// wymagania, żeby korzystać z SimpleObjectProperty: Java 8, 9, 10, ale nie 11, 12
public class NewsStation_V3 {
    // klasa SimpleObjectProperty<News> jest pewną właściwością typu News, co oznzcza, że obiekt ten jest pusty, póki coś do niego nie wstawimy
    // to klasa Property jest nasłuchiwana i oglądana, dlatego NewsStation nie implementuje Observable
    private SimpleObjectProperty<NewsV3> currentNews = new SimpleObjectProperty<>();    // jak nie można wczytać klasy SimpleObjectProperty -> Ctrl+Shift+Alt+s wybraćC: SDK 1.8, language level 8;

    public void dodajWatchera(ChangeListener<NewsV3> watcher){ // wybieramy metodę addListener(), która wymaga argumentu typu ChangeListener -> do Watchera implementujemy interface ChangeListener na obiekt NewsV3
        currentNews.addListener(watcher);                       // zaczynamy od nazwy: dodajWatchera() {}
    }                                                           // po wybraniu metody: currentNews.addListener(...) -> widzimy, że wymaga ona przekazania typu ChangeListener<T> -> uzupełniamy metodę dodajWatchera o ten argument

    public void usunWatchera(ChangeListener<NewsV3> watcher){
        currentNews.removeListener(watcher);
    }

    public void newNews(final NewsV3 newsV3) {
        // wystarcza jedna metoda: styValue -> roześlij informację o zmianie
        currentNews.setValue(newsV3);
        // zamiast poprzednio dwóch: setChanged() i notifyObserves()
    }
}
