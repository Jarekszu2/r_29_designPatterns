package creational_Builder.bohater;

import lombok.ToString;

// BUILDER: (wzorce stworzeniowe) ułatwia stworzenie obiektu z wybranymi polami z wielu innych
// nie trzeba tworzyć wielu setterów, ani wpisywać null'i w niepotrzebne pola
// przeważnie robimy jako klasa wewnętrzna danej klasy
@ToString
public class Bohater {
    private String imie, nazwisko, imieBabci, imieDziadka, imiePieska;
    private int wiek, wzrost, waga, ileNaKlate;
    private boolean alive;

    public Bohater(String imie, String nazwisko, String imieBabci, String imieDziadka, String imiePieska, int wiek, int wzrost, int waga, int ileNaKlate, boolean alive) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.imieBabci = imieBabci;
        this.imieDziadka = imieDziadka;
        this.imiePieska = imiePieska;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
        this.ileNaKlate = ileNaKlate;
        this.alive = alive;
    }

    public String toString2() {
        return "Bohater{" +
                "imie='" + imie + '\'' +
                (nazwisko != null ? ", nazwisko='" + nazwisko + '\'' : "") +
                (imieBabci != null ? ", imieBabci='" + imieBabci + '\'' : "") +
//                ", imieBabci='" + imieBabci + '\'' +
                (imieDziadka != null ? ", imieDziadka='" + imieDziadka + '\'' : "") +
                ", imiePieska='" + imiePieska + '\'' +
                (wiek != 0 ? ", wiek=" + wiek : "") +
                (wzrost != 0 ? ", wzrost=" + wzrost : "") +
                (waga != 0 ? ", waga=" + waga : "") +
                ", ileNaKlate=" + ileNaKlate +
                ", alive=" + alive +
                '}';
    }

    // tworzymy klasę wewnętrzną Builder (żeby była widoczna na zew. oznaczamy ją public static i kopiujemy wszystkie pola
    // klasę wewnętrzną tworzymy (można też stworzyć zwykłą klasę) dla wygody - jeśli mamy w package'u kilka, kilkanaście klas i dla każdej
    // tworzymy Buildera, to można się zgubić, kyóry Builder jest dla danej klasy; przy klasach wewnętrznych
    // Builder pisany po kropce klasy jest jednoznaczny np. Bohater.Builder
    public static class Builder{
        private String imie, nazwisko, imieBabci, imieDziadka, imiePieska;
        private int wiek, wzrost, waga, ileNaKlate;
        private boolean alive;

        // generujemy settery (wszystkie) i zmieniamy void'a na zwracanie Buildera (return this)

        public Builder setImie(String imie) {
            this.imie = imie;
            return this;
        }

        public Builder setNazwisko(String nazwisko) {
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder setImieBabci(String imieBabci) {
            this.imieBabci = imieBabci;
            return this;
        }

        public Builder setImieDziadka(String imieDziadka) {
            this.imieDziadka = imieDziadka;
            return this;
        }

        public Builder setImiePieska(String imiePieska) {
            this.imiePieska = imiePieska;
            return this;
        }

        public Builder setWiek(int wiek) {
            this.wiek = wiek;
            return this;
        }

        public Builder setWzrost(int wzrost) {
            this.wzrost = wzrost;
            return this;
        }

        public Builder setWaga(int waga) {
            this.waga = waga;
            return this;
        }

        public Builder setIleNaKlate(int ileNaKlate) {
            this.ileNaKlate = ileNaKlate;
            return this;
        }

        public Builder setAlive(boolean alive) {
            this.alive = alive;
            return this;
        }

        // piszemy metodę stworzeniową
        public Bohater build() {
            return new Bohater(imie, nazwisko, imieBabci, imieDziadka, imiePieska, wiek, wzrost, waga, ileNaKlate, alive);
        }
    }

}
