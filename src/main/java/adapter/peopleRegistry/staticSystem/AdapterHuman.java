package adapter.peopleRegistry.staticSystem;

import adapter.peopleRegistry.ICommonUser;

import java.time.LocalDate;

public class AdapterHuman implements ICommonUser {
    private final Human human;

    public AdapterHuman(Human human) {
        this.human = human;
    }

    @Override
    public int getId() {
        return human.getId();
    }

    @Override
    public String getName() {
        return human.getName();
    }

    @Override
    public String getSurname() {
        return human.getSurname();
    }

    @Override
    public String getpesel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public LocalDate getBirthDate() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", pesel='" + "unsupported" + '\'' +
                ", birthDate=" + "unsupported" +
                '}';
    }
}
