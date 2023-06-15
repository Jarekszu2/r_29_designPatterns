package behavioral.observerobservable.v1;

public class MainV1 {
    public static void main(String[] args) {
        System.out.println();

        NewsStationV1 newsStationV1 = new NewsStationV1();
        newsStationV1.addIWatcher(new WatcherV1(7, "Zibi"));
        newsStationV1.addIWatcher(new AnyClass());
        newsStationV1.addIWatcher(new WatcherV1(3, "Ania"));

        newsStationV1.newNews(new NewsV1("Już po 13-ej!", 10));
        newsStationV1.newNews(new NewsV1("Czas wstawać!", 5));
    }
}
