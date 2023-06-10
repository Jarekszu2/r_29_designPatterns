package structural.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println();

//        Hero bohater = Hero.createHero("Maniek");
//        IHero bohaterNaKoniu = new HeroOnAHorse(bohater);
//
//        // łapię w try/catch exception
//
//        try {
//            bohaterNaKoniu.attack(5);
//            bohaterNaKoniu.attack(5);
//            bohaterNaKoniu.attack(5);
//            bohaterNaKoniu.attack(5);
//            bohaterNaKoniu.attack(5);
//            bohaterNaKoniu.attack(5);
//        } catch (RuntimeException re) {
//            System.out.println("Hero dead.");
//        }

        // DODATEK
        // jak zrobić, żeby po zabiciu konia HeroOnAHorse stał się Hero?
        // w IHero dodaję do metody attac() throws Hero
        // Hero: dodaję extends Throwable
        // HeroOnAHorse: w implementacji metody attac() piszę zasady

        Hero bohater = Hero.createHero("Maniek");
        IHero bohaterNaKoniu = new HeroOnAHorse(bohater);
        System.out.println(bohaterNaKoniu);

        System.out.println();
        try {
            for (int i = 0; i < 10; i++) {
                bohaterNaKoniu.attack(20);
                System.out.println(bohaterNaKoniu);
            }
        } catch (Hero hero) {
            System.out.println("Horse dead.");
            bohaterNaKoniu = hero;  // już bez konia
        }
        System.out.println(bohaterNaKoniu);
        try {
            for (int i = 0; i < 10; i++) {
                bohaterNaKoniu.attack(10);
                System.out.println(bohaterNaKoniu);
            }
        } catch (Hero hero) {
            System.err.println("He dead.");
        } catch (RuntimeException re) {
            System.out.println("The hero is dead!");
        }
    }
}
