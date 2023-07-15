package adapter.peopleRegistry;

import java.time.LocalDate;

public interface ICommonUser {
    int getId();
    String getName();
    String getSurname();
    String getpesel();
    LocalDate getBirthDate();
}
