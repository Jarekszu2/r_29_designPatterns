package creational_Builder.hero;

import lombok.ToString;

// jak zrobić Builder'a przy pomocy IntelliJ
@ToString
public class Hero {
    private String imie, nazwisko, imieBabci, imieDziadka, imiePieska;
    private int wiek, wzrost, waga, ileNaKlate;
    private boolean alive;

    // tworzę pustą klasę: public static class Builder (klasa wewnętrzna w klasie Hero)
    // prawy przycisk myszy na nazwę konstruktora (Hero)
    // Refactor
    // Replace Constructor with Builder
    // wskazać: Use existing
    // w ramce wskazać utworzoną pustą klasę (creational_abstractFactory.hero.Hero.Builder) - napisać Builder i wybrać właściwy z listy
    // Refactor
    // (tworzą sie pola Buildera, setter'y i metoda stworzeniowa create


    public Hero(String imie, String nazwisko, String imieBabci, String imieDziadka, String imiePieska, int wiek, int wzrost, int waga, int ileNaKlate, boolean alive) {
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

    public static class Builder{

        private String imie;
        private String nazwisko;
        private String imieBabci;
        private String imieDziadka;
        private String imiePieska;
        private int wiek;
        private int wzrost;
        private int waga;
        private int ileNaKlate;
        private boolean alive;

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

        public Hero createHero() {
            return new Hero(imie, nazwisko, imieBabci, imieDziadka, imiePieska, wiek, wzrost, waga, ileNaKlate, alive);
        }
    }
}
