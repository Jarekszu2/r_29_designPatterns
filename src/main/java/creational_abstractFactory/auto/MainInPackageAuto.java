package creational_abstractFactory.auto;

public class MainInPackageAuto {
    public static void main(String[] args) {

        IAuto auto = MercedesAuto.createMercedesML();
        System.out.println(auto);
    }
}
