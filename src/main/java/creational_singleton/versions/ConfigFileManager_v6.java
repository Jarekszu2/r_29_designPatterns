package creational_singleton.versions;

// np. klasa, ktura reguluje odczyt i zapis do pliku
public class ConfigFileManager_v6 {
    // wersja 6 (lazy)

    // są dwa tryby tworzenia obiektu (instancji)
    // eager - instancja tworzy się przed pierwszym zastosowaniem (po załadowaniu klasy)
    // lazy - przy użyciu


    private static
    ConfigFileManager_v6 INSTANCE;

    private ConfigFileManager_v6() { // tworzymy konstruktor, ale żeby nikt nie mógł z niego korzystać - uprywatniamy go
        // np.
        System.out.println("Stworzyłem_6.");
    }

    public static ConfigFileManager_v6 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConfigFileManager_v6();
        }
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
