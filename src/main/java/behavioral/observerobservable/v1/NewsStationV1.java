package behavioral.observerobservable.v1;

// NewsStation musi w jakich sposób przechowywać te obiekty, które są zainteresowane zmianą (np. lista)
// oraz określić na czym zmiana ma polegać (np. nowa wiadomość News)

// co zrobić, żeby na wiadomości NewStation mogła reagować dowolna inna klasa niż Watcher
// tworzę interface IWatcher z jakąś metodą która informuje o wiadomości np. void update(News news)

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class NewsStationV1 {
//    private List<IWatcher> iWatchers = new ArrayList<>();
    private Vector<IWatcher> iWatchers = new Vector<>(); // zamieniem listę na vektor co zapewnia synchronizację (bez tego, w czasie gdy jeden wątek by np. iterował listę, a drugi coś do niej dodawał lub usuwał, mógłby powstawać: currentmodificationexception) (Chyba jednak dalej to nie rozwiazuje?)
    private NewsV1 currentNews;

    public void addIWatcher(IWatcher iWatcher) {
        iWatchers.add(iWatcher);
    }

    public void newNews(NewsV1 newsV1) {
        iWatchers.forEach(iWatcher -> iWatcher.update(newsV1));
    }
}
