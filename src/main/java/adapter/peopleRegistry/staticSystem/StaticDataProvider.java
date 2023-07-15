package adapter.peopleRegistry.staticSystem;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StaticDataProvider {
    private List<Human> humans;

    public StaticDataProvider() {
        humans = new ArrayList<>();

        humans.add(new Human(123, "Zią", "Yo" ));
        humans.add(new Human(71223, "Gosia", "Kwaśny" ));
        humans.add(new Human(1231, "Marian", "Goliwąs" ));
        humans.add(new Human(1263, "Alf", "Goliwąs" ));
        humans.add(new Human(7123, "Alfred", "Buzia" ));
        humans.add(new Human(156, "Filip", "Oczy" ));
        humans.add(new Human(42, "Aleksandra", "Śmieszny" ));
        humans.add(new Human(13, "Aleksy", "Zabawny" ));
        humans.add(new Human(68, "Alek", "Niezabawny" ));
    }
}
