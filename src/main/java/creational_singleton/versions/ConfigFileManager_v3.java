package creational_singleton.versions;

// np. klasa, ktura reguluje odczyt i zapis do pliku
public class ConfigFileManager_v3 {
    // wersja 3: (lazy, synchronized)

    // są dwa tryby tworzenia obiektu (instancji)
    // eager - instancja tworzy się przed pierwszym zastosowaniem (po załadowaniu klasy)
    // lazy - przy użyciu


    private static ConfigFileManager_v3 INSTANCE; // w stosunku do poprzednich wersji usuwam prawą stronę, a w konsekwencji - final

    private ConfigFileManager_v3() { // tworzymy konstruktor, ale żeby nikt nie mógł z niego korzystać - uprywatniamy go
        // np.
        System.out.println("Stworzyłem_3.");
    }

//    public static ConfigFileManager_v4 getInstance() {
//        return INSTANCE; // zwrócenie INSTANCE zwraca null'a, co oczywiście nam nie odpowiada
//    }

//    public static ConfigFileManager_v4 getInstance(){
//        if (INSTANCE == null) {
//            INSTANCE = new ConfigFileManager_v4();
//        }
//        return INSTANCE;
        // za pierwszym razaem gdy wywołam metodę INSTANCE == null (bo go nie ma)
        // robię warunek: jak go nie ma, to go stwórz, a jeżeli będzie - zwróć INSTANCE
        // wersja: lazy
//    }

    // ta wersja ma problemy; jeżeli mamy dwa wątki (w1, w2) i dwa wątki uruchamiają w tym samym
    // momencie metodę getInstance() - to dla nich INSTANCE == null i oba tworzą nową instancję,
    // więc mamy dwie różne, a nie jedną
    // teoretycznie rozwiązaniem jest synchronizacja metody getInstance(), ale po pierwsze to nie zawsze działa,
    // (tak jest napisana metoda synchronize i nic z tym nie mozna zrobić), po drugie traci się w ten sposób
    // wielowątkowość (wątki ustawiają sie szeregowo w kolejce do synchronizacji);
    // Rozwiązanie:

    public static ConfigFileManager_v3 getInstance(){
        if (INSTANCE == null){
            synchronized (ConfigFileManager_v3.class){
                if (INSTANCE == null) {
                    INSTANCE = new ConfigFileManager_v3();
                }
            }
        }
        return INSTANCE;
    }
    // pierwszy if nie blokuje wątków (nie mamy synchronizacji), teoretycznie jeśli INSTANCE jest stworzona
    // to wszystkie wątki mogą z niej skorzystać; jeśli INSTANCE nie jest stworzona, to wątki zatrzymują się
    // przy synchronized, jeden przechodzi, upewnia się, że żaden inny nie dostał się przed nim, nadpisuje INSTANCE
    // i wtedy pozostałe wątki już nie wchodzą do nadpisania (INSTANCE = new ConfigFileManager_v4(), bo sprawdziły,
    // że poprzedni już nadpisał i INSTANCE != null;

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
