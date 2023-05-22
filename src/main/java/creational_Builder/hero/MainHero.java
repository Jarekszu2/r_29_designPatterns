package creational_Builder.hero;

public class MainHero {
    public static void main(String[] args) {
                Hero hero = new Hero.Builder()
                .setImie("Arni")
                .setIleNaKlate(180)
                .setAlive(true)
                .createHero();

        System.out.println(hero);
    }
}
