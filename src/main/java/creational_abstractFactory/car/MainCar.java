package creational_abstractFactory.car;

public class MainCar {
    public static void main(String[] args) {
        Car audiA3_biale = CarFactoryAudi.createA3("bialy");
        System.out.println(audiA3_biale);

        System.out.println();
        Car audiA3_czerwone = CarFactoryAudi.createA3("czerwony");
        System.out.println(audiA3_czerwone);
    }
}
