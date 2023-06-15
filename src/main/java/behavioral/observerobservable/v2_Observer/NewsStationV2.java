package behavioral.observerobservable.v2_Observer;

import behavioral.observerobservable.handyMade.News;

import java.util.Observable;

public class NewsStationV2 extends Observable {
    private NewsV2 currentNews;

    public void newNews(final NewsV2 newsV2){
        this.currentNews = newsV2;

        // rozgłoszenie wiadomości do watchersów
        // z dokumentacji klasy wynika że, żeby wysłać obiekt do watchersów, trzeba go najpierw oznaczyć, że jest zmieniony
        setChanged();   // zaznacz w polu - "wprowadzono zmiany" (oznacz obiekt jako zmieniony)
        notifyObservers(newsV2);    // roześlij informacje o zmianie
    }

    // dla celów testowych dodaję wersję metody newNews() z argumentem typu Object
    public void newNews(final Object news){
        setChanged();
        notifyObservers(news);
    }
}
