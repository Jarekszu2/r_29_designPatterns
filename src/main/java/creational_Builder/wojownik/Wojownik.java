package creational_Builder.wojownik;

import lombok.Builder;
import lombok.ToString;

// Stworzenie Buildera przez adnotację @Builder lomboka
// bardzo często stosuje się połączenie Buildera i Abstract factory - metoda stworzeniowa createWojMieszkoI()
@ToString
@Builder
public class Wojownik {
    private String imie, nazwisko, imieBabci, imieDziadka, imiePieska;
    private int wiek, wzrost, waga, ileNaKlate;
    private boolean alive;

    public Wojownik(String imie, String nazwisko, String imieBabci, String imieDziadka, String imiePieska, int wiek, int wzrost, int waga, int ileNaKlate, boolean alive) {
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

    public static Wojownik createWojMieszkoI(){
        return Wojownik.builder().imie("Szczepan").ileNaKlate(100).alive(true).imiePieska("Burek").build();
    }
}
