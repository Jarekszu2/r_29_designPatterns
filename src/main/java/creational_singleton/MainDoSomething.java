package creational_singleton;

import creational_singleton.versions.ConfigFileManager_v1;
import creational_singleton.versions.ConfigFileManager_v3;

public class MainDoSomething {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Wersja 1.");
        ConfigFileManager_v1.doSomething(); // po wywołaniu maina widać, że zostaje stworzona instancja mimo uruchomienia tylko metody doSomething() - eager

        System.out.println();
        System.out.println("Wersja 3.");
        ConfigFileManager_v3.doSomething(); // po wywołaniu maina widać, że nie zostaje stworzona instancja po wywołaniu metody doSomething() - lazy
    }
}
