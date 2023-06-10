package structural.decorator;

import lombok.Data;

@Data
public class HeroOnAHorse implements IHero{

    private final Hero hero;    // klasa rozszerzająca wymaga, żeby w konstruktorze podać klasę rozszerzaną (final) - nie może być HeroOnAHorse bez Hero

    public HeroOnAHorse(Hero hero) {
        this.hero = hero;
        // dopisuję pozostałe pozycje
        this.additionalAttackPoints = 50;
        this.additionalDefencePoints = 50;
        this.additionalHealthPoints = 50;
    }

    private int additionalAttackPoints;
    private int additionalDefencePoints;
    private int additionalHealthPoints;

    @Override
    public int getAttackPoints() {
        return hero.getAttackPoints() + additionalAttackPoints;
    }

    @Override
    public int getDefencePoints() {
        return hero.getDefencePoints() + additionalDefencePoints;
    }

    @Override
    public int getHealthPoints() {
        return hero.getHealthPoints() + additionalHealthPoints;
    }

    @Override
    public void attack(int points) throws Hero{
        System.out.println("Atak!");
        int ileZyciaOdjac = getDefencePoints() / points;
        additionalHealthPoints -= ileZyciaOdjac;
        if (additionalHealthPoints <= 0){
            System.err.println("Horse died.");
            throw hero;
        }
    }
}
