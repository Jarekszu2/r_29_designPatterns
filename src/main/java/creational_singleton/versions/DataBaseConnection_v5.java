package creational_singleton.versions;

// w Intellij tworzymy nową klasę i w menu rozwijanym wybieramy nie interface, nie enum, tylko singleton
public class DataBaseConnection_v5 {
    private static DataBaseConnection_v5 ourInstance = new DataBaseConnection_v5();

    public static DataBaseConnection_v5 getInstance() {
        return ourInstance;
    }

    private DataBaseConnection_v5() {
        System.out.println("DataBaseConnection.");
    }
}
