package behavioral.observerobservable.handyMade;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        NewsStation newsStation = new NewsStation();
        newsStation.addWatcher(new Watcher(10, "Maniek"));
        newsStation.addWatcher(new Watcher(8, "Ziuta"));
        newsStation.addWatcher(new Watcher(6, "Franek"));
        newsStation.addWatcher(new Watcher(4, "Zocha"));
        newsStation.addWatcher(new Watcher(2, "Amanda"));

        newsStation.newNews(new News("Koniec cukru w sklepie", 3));
        newsStation.newNews(new News("Promocja w Biedronce się skończyła", 5));
        newsStation.newNews(new News("W niedzielę sklepy otwarte!", 10));
        newsStation.newNews(new News("World Trade Center - atak terrorystyczny!", 9));
    }
}
