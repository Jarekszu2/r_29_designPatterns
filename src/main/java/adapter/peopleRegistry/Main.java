package adapter.peopleRegistry;

import adapter.peopleRegistry.fileSystem.FileDataProvider;
import adapter.peopleRegistry.fileSystem.Person;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/*
TODO: pobierz wszystkich ludzi ze wszystkich systemów w jednakowym formacie.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();

//        FileDataProvider fileDataProvider = new FileDataProvider();
//        List<Person> people = fileDataProvider.getPeople();
//        people.sort(Comparator.comparing(Person::getId));
//        people.forEach(System.out::println);
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());

        System.out.println();
        PeopleRegistry peopleRegistry = new PeopleRegistry();
        List<ICommonUser> commonUsers = peopleRegistry.getCommonUsers();
        commonUsers.forEach(System.out::println);
    }
}
