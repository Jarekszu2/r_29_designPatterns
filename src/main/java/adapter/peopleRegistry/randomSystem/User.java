package adapter.peopleRegistry.randomSystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int identifier;
    private String nameAndSurname;
    private String socialIdentifier;
    private LocalDate birthDate;
}
