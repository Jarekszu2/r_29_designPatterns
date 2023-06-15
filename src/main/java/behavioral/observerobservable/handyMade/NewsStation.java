package behavioral.observerobservable.handyMade;

import java.util.ArrayList;
import java.util.List;

// NewsStation musi w jakich sposób przechowywać te obiekty, które są zainteresowane zmianą (np. lista)
// oraz określić na czym zmiana ma polegać (np. nowa wiadomość News)
public class NewsStation {
    // lista obiektów zainteresowanych zmianą
    private List<Watcher> watchers = new ArrayList<>();

    private News currentNews;

    public void addWatcher(Watcher watcher){
        watchers.add(watcher);
    }

    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    public void newNews(News news) {
        this.currentNews = news;
        // rozgłoszenie wiadomości do Watchersów
        watchers.forEach(watcher -> watcher.notifyAboutNews(news));
    }
}
