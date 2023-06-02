package creational_abstractFactory.car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// jeżeli chcemy stworzyć wiele takich samych obiektów, to tworzymy metodę stworzeniową
// zasada: don't repeat yourself (nie powtarzaj się) = zamiast tworzyć new Object, new Object, new Object ... - metoda stworzeniowa
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {
    private String color;
    private double horsepower;
    private String manufacturer;
    private String model;
    private boolean turbo;
    private double engineCapacity;
}
