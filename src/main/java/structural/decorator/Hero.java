package structural.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

// klasa finalna: nie można jej rozszerzać, nie można wpłynąć na żadne pole, korzystamy z gotowego rozwiazania
// (jeżeli wyedytujemy klsaę projekt przestanie działać)
// jeżeli chcemy rozszerzać (modyfikować) postać bez rozszerzania klasy - dodać nową funkcjonalność, nowe metody
// tworzymy klasę HeroOnAHorse z dodatkową funkcjonalnością dla Hero
// tworzymy interface IHero i metody do pobierania właściwości z Hero
// implementuje IHero do Hero i do HeroOnAHorse
// DECORATOR polega na tym, że klasa rozszerzająca zawiera klasę bazową, mają wspólne zachowania (metody interfejsu IHero), które mogą być wzbogacone o dodatkowe funkcje,
// a idea polega na "sumowaniu" właściwiści Hero i HeroOnAHorse w metodach interfejsu dla HeroOnAHorse
@AllArgsConstructor
@Getter
@ToString
public final class Hero extends Throwable implements IHero {
    private String name;
    private int attackPoints;
    private int defencePoints;
    private int healthPoints;

    public static Hero createHero(String name){
        return new Hero(name, 100, 200, 100);
    }


    @Override
    public void attack(int points) {
        System.out.println("Atak!");
        int ileZyciaOdjac = getDefencePoints() / points;
        healthPoints -= ileZyciaOdjac;
        if (healthPoints <= 0){
            System.err.println("Hero dead.");
            throw new RuntimeException();
        }
    }
}
