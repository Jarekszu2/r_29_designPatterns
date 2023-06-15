package behavioral.observerobservable.v1;

public class AnyClass implements IWatcher { // klasa tylko demonstracyjna, żeby pokazać, że newsV1 może być widoczne w dowolnej klasie
    @Override
    public void update(NewsV1 newsV1) {
        System.out.println("AnyClass: " + newsV1);
    }
}
