package behavioral.observerobservable.v2_Observer;

public class MainV2 {
    public static void main(String[] args) {
        System.out.println();

        NewsStationV2 newsStationV2 = new NewsStationV2();
        newsStationV2.addObserver(new WatcherV2(4, "Hilda"));
        newsStationV2.addObserver(new WatcherV2(8, "Eva"));
        newsStationV2.addObserver(new AnyClass2());
        newsStationV2.addObserver(new WatcherV2(9, "Zenek"));

        newsStationV2.newNews(new NewsV2("W końcu wakacje!", 9));
        newsStationV2.newNews(new NewsV2("Nie ma, nie ma, wody na pustyni.", 6));
        newsStationV2.newNews(new Potato());
    }
}
