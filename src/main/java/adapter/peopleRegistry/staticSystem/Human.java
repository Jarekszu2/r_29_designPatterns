package adapter.peopleRegistry.staticSystem;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Human {
    private int id;
    private String name;
    private String surname;
}
