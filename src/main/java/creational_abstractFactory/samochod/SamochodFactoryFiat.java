package creational_abstractFactory.samochod;
// Uwaga:
// finalne pole tzn. nie możemy go zmienić
// finalna metoda tzn. nie możemy jej nadpisać
// finalna klasa tzn. nie można jej dziedziczyć
// prywatny konstruktor - nie można stworzyć instancji

// robiąc finalna klasę i prywatny konstruktor mamy pewność, że nikt nie stworzy instancji takiej klasy (alternatywa - klasa abstract (opcje do wyboru))
// ale będzi mógł używać metod tej klasy (np. create (static))
public final class SamochodFactoryFiat { // klasa finalna

    private SamochodFactoryFiat() {      // prywatny konstruktor
    }

    public static Samochod createStilo(String color){
        return new Samochod(color, 120, "FIAT", "Stilo", true, 1.9);
    }
}
