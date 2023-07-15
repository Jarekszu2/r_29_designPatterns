package adapter.peopleRegistry.fileSystem;

import adapter.peopleRegistry.ICommonUser;

import java.time.LocalDate;

public class AdapterPerson implements ICommonUser {
    private final Person person;

    public AdapterPerson(Person person) {
        this.person = person;
    }

    @Override
    public int getId() {
        return person.getId();
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public String getSurname() {
        return person.getSurname();
    }

    @Override
    public String getpesel() {
        return person.getPesel();
    }

    @Override
    public LocalDate getBirthDate() {
        return person.getBirthDate();
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", pesel='" + getpesel() + '\'' +
                ", birthDate=" + getBirthDate() +
                '}';
    }
}
