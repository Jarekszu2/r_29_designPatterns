package creational_abstractFactory.auto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// Uwaga - metody stworzeniowe nie muszą być koniecznie w oddzielnej klsie abstract factory
public class MercedesAuto extends Auto {
    private boolean celownik;

    // konstruktor może być pivate ale nie musi (private - nik nie stworzy instancji inaczej niż poprzez metodę stworzeniową)
    private MercedesAuto(String color, int horsePower, String manufacturer, String model, boolean turbo, double engineCapacity, boolean celownik) {
        super(color, horsePower, manufacturer, model, turbo, engineCapacity);
        this.celownik = celownik;
    }

    // public static - metoda stworzeniowa, która zwraca gotowy obiekt
    public static IAuto createMercedesML() {
        return new MercedesAuto("black", 180, "Mercedes-Benz", "ML", true, 2.4, true);
    }

//    @Override
//    public String toString() {
//        return "Mercedes ML 2.4{" + this.getColor() + ", HP " + this.getHorsePower() + ", " +
//                "celownik=" + celownik +
//                '}';
//    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + this.getColor() + '\'' +
                ", horsePower=" + this.getHorsePower() +
                ", manufacturer='" + this.getManufacturer() + '\'' +
                ", model='" + this.getModel() + '\'' +
                ", turbo=" + this.isTurbo() +
                ", engineCapacity=" + this.getEngineCapacity() +
                ", celownik=" + celownik +
                '}';
    }
}
