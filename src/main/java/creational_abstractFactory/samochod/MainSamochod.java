package creational_abstractFactory.samochod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainSamochod {
    public static void main(String[] args) {
        System.out.println();

        Samochod stiloSrebrne = SamochodFactoryFiat.createStilo("srebrny");
        System.out.println(stiloSrebrne.printFiatStilo());

        System.out.println();
        Samochod stiloNiebieskie = SamochodFactoryFiat.createStilo("niebieski");
        System.out.println(stiloNiebieskie.printFiatStilo());

        List<Samochod> samochodList = new ArrayList<>();
        samochodList.add(stiloNiebieskie);
        samochodList.add(stiloSrebrne);

        Character[] tab = new Character[] {'a'};
        Map<Character, Samochod> map = new HashMap<>();

        samochodList.forEach(samochod -> map.put(tab[0]++, samochod));

        System.out.println();
        map.forEach((k, v) -> System.out.println(k + ") " + v.printFiatStilo()));
    }
}
