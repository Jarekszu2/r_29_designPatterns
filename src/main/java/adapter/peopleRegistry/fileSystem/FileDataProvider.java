package adapter.peopleRegistry.fileSystem;

import lombok.Data;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
public class FileDataProvider {
    private List<Person> people;

    public FileDataProvider() {
        people = new ArrayList<>();
        loadList();
    }

    public void loadList(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("input.txt")))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                    people.add(parse(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Person parse(String line) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String[] splitElements = line.split(" ");
        return new Person(Integer.parseInt(splitElements[0]), splitElements[1], splitElements[2], splitElements[3], LocalDate.parse(splitElements[4], formatter));
    }
}
