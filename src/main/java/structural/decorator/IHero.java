package structural.decorator;

public interface IHero {

    int getAttackPoints();

    int getDefencePoints();

    int getHealthPoints();

    // dodaję przykładową funkcję
    void attack(int points) throws Hero; // ile punktów życia Hero zabieramy przy ataku
}
