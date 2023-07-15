package adapter.peopleRegistry;

import adapter.peopleRegistry.fileSystem.AdapterPerson;
import adapter.peopleRegistry.fileSystem.FileDataProvider;
import adapter.peopleRegistry.fileSystem.Person;
import adapter.peopleRegistry.randomSystem.AdapterUser;
import adapter.peopleRegistry.randomSystem.RandomDataProvider;
import adapter.peopleRegistry.randomSystem.User;
import adapter.peopleRegistry.staticSystem.AdapterHuman;
import adapter.peopleRegistry.staticSystem.Human;
import adapter.peopleRegistry.staticSystem.StaticDataProvider;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
public class PeopleRegistry {
    private List<ICommonUser> commonUsers = new ArrayList<>();

    public PeopleRegistry() {
        FileDataProvider fileDataProvider = new FileDataProvider();
        List<Person> people = fileDataProvider.getPeople();
        people.forEach(person -> commonUsers.add(new AdapterPerson(person)));

        RandomDataProvider randomDataProvider = new RandomDataProvider();
        List<User> users = randomDataProvider.getUsers();
        users.forEach(user -> commonUsers.add(new AdapterUser(user)));

        StaticDataProvider staticDataProvider = new StaticDataProvider();
        List<Human> humans = staticDataProvider.getHumans();
        humans.forEach(human -> commonUsers.add(new AdapterHuman(human)));

        commonUsers.sort(Comparator.comparing(ICommonUser::getId));
    }
}
