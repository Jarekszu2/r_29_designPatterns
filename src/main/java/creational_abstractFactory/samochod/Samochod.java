package creational_abstractFactory.samochod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// inna wersja na metodę stworzeniową
public class Samochod {
    private String color;
    private int horsepower;
    private String manufacturer;
    private String model;
    private boolean turbo;
    private double engineCapacity;

    public String printFiatStilo() {
        return "Fiat Stilo, " +
                color +
                ", HP " + horsepower +
                ", turbo" +
                ", " + engineCapacity;
    }
}
