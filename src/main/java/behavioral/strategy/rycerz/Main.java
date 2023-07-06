package behavioral.strategy.rycerz;

import behavioral.observerobservable.handyMade.News;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Knight knight = new Knight("Zawisza");
        Sword sword = new Sword();
        Spear spear = new Spear();
        Bow bow = new Bow();

        System.out.println("Walka rycerza: " + knight.getName());
        knight.walka();
        knight.walka();
        knight.walka();
        System.out.println("Zmiana broni.");
        knight.zmianaBroni(spear);
        knight.walka();
        knight.walka();
        System.out.println("Zmiana broni.");
        knight.zmianaBroni(bow);
        knight.walka();
        knight.walka();
        System.out.println("Zmiana broni.");
        knight.zmianaBroni(sword);
        knight.walka();
        System.err.println("The dragon ist dead!");
    }
}
