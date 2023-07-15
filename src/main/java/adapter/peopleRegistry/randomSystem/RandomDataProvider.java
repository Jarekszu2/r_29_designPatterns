package adapter.peopleRegistry.randomSystem;

import lombok.Data;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

@Data
public class RandomDataProvider {
    private List<User> users;

    public RandomDataProvider() {
        users = new ArrayList<>();
        loadList();
    }

    private void loadList() {
        Random r = new Random();
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            boolean flag = false;
            while (!flag) { // zapewniam unikalność numerów id
                int id = r.nextInt(50) + 1300;
                if (!integers.contains(id)){
                    integers.add(id);
                    flag = true;
                }
            }
            String nameAndSurname = uuid.toString().replaceAll("-", "").substring(r.nextInt(5), r.nextInt(6) + 5) + " " + uuid.toString().replaceAll("-", "").substring(r.nextInt(6) + 6, r.nextInt(12) + 15);
            String pesel = (r.nextInt(1000000) + 6901010) + String.valueOf(r.nextInt(1000) + 1000);
            users.add(new User(r.nextInt(50) +1300, nameAndSurname, pesel, generateDate()));
        }
    }

    private LocalDate generateDate() {
        long dateMin = LocalDate.of(1969, 1, 1).toEpochDay();
        long dateMax = LocalDate.of(1999, 12, 31).toEpochDay();
        long randomDate = ThreadLocalRandom.current().nextLong(dateMin, dateMax);
        return LocalDate.ofEpochDay(randomDate);
    }
}
