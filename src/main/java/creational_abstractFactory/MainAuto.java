package creational_abstractFactory;

import creational_abstractFactory.auto.AutoFactorySkoda;
import creational_abstractFactory.auto.IAuto;
import creational_abstractFactory.auto.MercedesAuto;

// dzięki zastosowaniu interface, main może być poza package Auto
public class MainAuto {
    public static void main(String[] args) {
        System.out.println();

        IAuto yetiSilber = AutoFactorySkoda.createSkodaYeti("silber");
        System.out.println(yetiSilber);

        System.out.println();
        IAuto yetiDunkelblau = AutoFactorySkoda.createSkodaYeti("dunkelblau");
        System.out.println(yetiDunkelblau);

        System.out.println();
        IAuto super_1 = AutoFactorySkoda.createSkodaSuperb();
        System.out.println(super_1);

        System.out.println();
        IAuto super_2 = AutoFactorySkoda.createSkodaSuperb();
        System.out.println(super_2);

        System.out.println();
        IAuto merc = MercedesAuto.createMercedesML();
        System.out.println(merc);
    }
}
