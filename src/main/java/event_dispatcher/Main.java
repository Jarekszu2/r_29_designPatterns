package event_dispatcher;

import event_dispatcher.actors.Cashier;
import event_dispatcher.actors.Chef;
import event_dispatcher.actors.Guest;
import event_dispatcher.actors.SecurityGuy;
import event_dispatcher.dispatcher.Dispatcher;
import event_dispatcher.event.GuestArrivedEvent;
import event_dispatcher.event.GuestOrderedEvent;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        // w ten sposób rejestrujemy obiekty, żeby były powiadamiane o eventach
//        Dispatcher.getInstance().register(new Chef());  // - zarejestrowanie obiektu Chef
        // jest to uciążliwe, bo trzeba to zrobić dla każdego obiektu (ale można i tak)
        // aby to uprościć można zrobić IBaseClass i rozszerzyć (extends) aktorów o tę klasę
        // dzieki temu, obiekty stworzone przez new będą się same rejestrować do Dispatchera


        new Chef("Chef nr1");
        new Chef("Chef nr2");
        new SecurityGuy();
        new Cashier();

        Dispatcher.getInstance().fireEvent(new GuestArrivedEvent(new Guest("Maniek"))); // nikt nie jest zainteresowany (nikt nie zaimplementował)
        Dispatcher.getInstance().fireEvent(new GuestOrderedEvent(new Guest("Zenek"), new Order("frytki", 5.0)));
    }
}
