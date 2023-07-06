package behavioral.strategy.rycerz;

public class Bow implements I_Strategy {
    @Override
    public void walcz() {
        System.out.println("Strzał z łuku.");
    }
}
