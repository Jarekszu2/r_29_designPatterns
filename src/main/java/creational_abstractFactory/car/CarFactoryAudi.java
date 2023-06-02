package creational_abstractFactory.car;

public abstract class CarFactoryAudi {  // robimy klasę abstrakt, żeby nie tworzyć obiektu/instancji tej klasy
                                        // (nie alokujemy dla takiego obiektu pamięci (nie marnujemy zasobów pamięci))
                                        // albo żeby nie robić instancji robimy klasę final i konstructor private
                                        // metodę robimy statyczną
    public static Car createA3(String color){
        return new Car(color, 130, "Audi", "A3", false, 2.0);
    }
}
