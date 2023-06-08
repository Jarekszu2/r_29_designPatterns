package creational_singleton.versions;

// np. klasa, ktura reguluje odczyt i zapis do pliku
public class ConfigFileManager_v2 {
    // wersja 2

    // są dwa tryby tworzenia obiektu (instancji)
    // eager - instancja tworzy się przed pierwszym zastosowaniem (po załadowaniu klasy)
    // lazy - przy użyciu


    private static final ConfigFileManager_v2 INSTANCE = new ConfigFileManager_v2();

    private ConfigFileManager_v2() { // tworzymy konstruktor, ale żeby nikt nie mógł z niego korzystać - uprywatniamy go
        // np.
        System.out.println("Stworzyłem_1.");
    }

    public static ConfigFileManager_v2 getInstance() {
        return INSTANCE;
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
