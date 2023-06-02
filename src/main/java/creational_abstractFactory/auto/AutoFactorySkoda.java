package creational_abstractFactory.auto;

// Abstract factory - klasa, która jest zbiorczą klasą z wieloma matodami "factory"
public abstract class AutoFactorySkoda {    // można tworzyć nieskończenie wiele metod stworzeniowych

    // metoda factory - pojedynacz matoda stworzeniowa
    public static Auto createSkodaYeti(String color) {
        return new Auto(color, 105, "Skoda", "Yeti", true, 1.2);
    }

    public static IAuto createSkodaSuperb(){
        return new Auto("weiss", 170, "Skoda", "Superb", true, 2.0);
    }
}
