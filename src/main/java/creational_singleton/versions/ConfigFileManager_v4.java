package creational_singleton.versions;

// np. klasa, ktura reguluje odczyt i zapis do pliku
public enum ConfigFileManager_v4 {
    // wersja 4 najlepsza (enum)
    // eager - enumy ładują się mimo wszystko, zanim się z nich skorzysta (w momencie załadowania klasy (nie muszę wywoływać metody, mogę np. wylistować)

    INSTANCE;
//    INSTANCE(5); // każdy element enuma jest pojedynczą instancją

//    private int number;

    // można zrobić prywatny konstruktor, chociaż z definicji (by definition) są one prywatne, ale dla pewności
    private ConfigFileManager_v4() {
        System.out.println("Stworzyłem! (enum)");
    }


//    private ConfigFileManager_v4(int number) {
//        this.number = number;
//        System.out.println("Stworzyłem! (enum) " + number);
//    }

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

//    public int getNumber() {
//        return number;
//    }
}
