package creational_singleton;

import creational_singleton.versions.*;

public class Main {
    public static void main(String[] args) {
        // singleton - pojedyncza (i jedyna w całym programie) instancja obiektu pewnej klasy
        // zależy nam, żeby singleton:
        // - był w odpowiednim momencie stworzony
        // - żeby został odpowiednio zainicjalizowany
        // - żeby nie można go było nadpisać
        // np. przechowywanie pliku konfiguracyjnego aplikacji lub jedno połączenie z bazą danych


        // UWAGA
        // stosowanie zbyt wielu singletonów narusza zasady obiektowości
        // mówi się czasami, że singleton to antywzorzec, ponieważ podejście obiektowe to jest, gdy mamy klasy,
        // ich instancje i interakcje między nimi; natomiast metody statyczne automatycznie wykluczają obiektowość
        // jeżeli singleton nie jest nadużywany, zachowuje zasady byia wzorcem (nie nadużywając tego wzorca dalej zachowujemy obiektowość

        // wersja: lazy
        ConfigFileManager_v1.INSTANCE.wczytajPlik(); // INSTANCE - statyczna instancja do wykorzystania w całym programie (wszędzie)

        // wersja: eager
        ConfigFileManager_v2.getInstance();

        // wersja3
        ConfigFileManager_v3.getInstance();

        // wersja: enum
//        ConfigFileManager_v4.values();
        ConfigFileManager_v4.INSTANCE.wczytajPlik();
//        System.out.println(ConfigFileManager_v4.INSTANCE.getNumber());

        // wersja: Intellij
        DataBaseConnection_v5.getInstance();
    }
}
