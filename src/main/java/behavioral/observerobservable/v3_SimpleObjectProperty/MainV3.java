package behavioral.observerobservable.v3_SimpleObjectProperty;

public class MainV3 {
    public static void main(String[] args) {
        System.out.println();

        NewsStation_V3 newsStation_v3 = new NewsStation_V3();
        newsStation_v3.dodajWatchera(new WatcherV3(7, "Maniek"));
        newsStation_v3.dodajWatchera(new WatcherV3(4, "Zyga"));
        newsStation_v3.dodajWatchera(new AnyClass3());
        newsStation_v3.dodajWatchera(new WatcherV3(2, "Zbig"));

        newsStation_v3.newNews(new NewsV3("O rany: burza!", 5));
        System.out.println();
        newsStation_v3.newNews(new NewsV3("Kurde", 3));
    }
}
