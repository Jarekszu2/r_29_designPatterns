package behavioral.strategy.rycerz;

public class Sword implements I_Strategy {
    @Override
    public void walcz() {
        System.out.println("Cios mieczem.");
    }
}
