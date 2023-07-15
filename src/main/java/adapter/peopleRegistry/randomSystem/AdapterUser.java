package adapter.peopleRegistry.randomSystem;

import adapter.peopleRegistry.ICommonUser;

import java.time.LocalDate;

public class AdapterUser implements ICommonUser {
    private final User user;

    public AdapterUser(User user) {
        this.user = user;
    }

    @Override
    public int getId() {
        return user.getIdentifier();
    }

    @Override
    public String getName() {
        String[] strings = user.getNameAndSurname().split(" ");
        return strings[0];
    }

    @Override
    public String getSurname() {
        String[] strings = user.getNameAndSurname().split(" ");
        return strings[1];
    }

    @Override
    public String getpesel() {
        return user.getSocialIdentifier();
    }

    @Override
    public LocalDate getBirthDate() {
        return user.getBirthDate();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", pesel='" + getpesel() + '\'' +
                ", birthDate=" + getBirthDate() +
                '}';
    }
}
