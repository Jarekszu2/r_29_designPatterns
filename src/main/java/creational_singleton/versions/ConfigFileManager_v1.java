package creational_singleton.versions;

// np. klasa, ktura reguluje odczyt i zapis do pliku
public class ConfigFileManager_v1 {
    // wersja 1 (eager)

    // są dwa tryby tworzenia obiektu (instancji)
    // eager - instancja tworzy się przed pierwszym zastosowaniem (po załadowaniu klasy) - inicjalizacja następuje w momencie załadowania klasy
    // lazy - przy użyciu - inicjalizacja następuje dopiero gdy dochodzi do wykorzystania obiektu


    // singleton powinien mieć instancję; b. często ustawia sie instancje publiczną
    public static final ConfigFileManager_v1 INSTANCE = new ConfigFileManager_v1();

    public static void doSomething() { // dopisuje dowolną metodę nie związaną z samą instancją (by pokazać czy jest eager czy lazy)
        System.out.println("Something.");
    }

    private ConfigFileManager_v1() { // tworzymy konstruktor, ale żeby nikt nie mógł z niego korzystać - uprywatniamy go
        // np.
        System.out.println("Stworzyłem_1.");
    }

    private void otworzPlik(){

    }

    private void zamknijPlik(){

    }

    public void wczytajPlik(){
        otworzPlik();
        // ... logika wczytywania
        zamknijPlik();
    }

    public void zapiszPlik(){
        otworzPlik();
        // ... logika zapisywania
        zamknijPlik();
    }
}
