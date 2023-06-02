package creational_abstractFactory.auto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Auto implements IAuto{    // Uwaga: klasa nie jest public tylko package protected; nie będzie można jej dziedziczyć i tworzyć własnych customowych obiektów Auto (wszystko jest w oddzielnym packagu i nikt nie będzie tu grzebał); dostęp do danych rozwiązujemy przez interface
    private String color;
    private int horsePower;
    private String manufacturer;
    private String model;
    private boolean turbo;
    private double engineCapacity;
}
