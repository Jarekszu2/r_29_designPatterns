package event_dispatcher_2_warehouse;

import event_dispatcher_2_warehouse.actors.Actor3_Accountant;
import event_dispatcher_2_warehouse.actors.Actor2_Cashier;
import event_dispatcher_2_warehouse.actors.Actor1_Seller;
import event_dispatcher_2_warehouse.actors.Actor4_Stockman;
import event_dispatcher_2_warehouse.dispatcher.Dispatcher;
import event_dispatcher_2_warehouse.event.ClientArrivedEvent;
import event_dispatcher_2_warehouse.event.ClientOrderedEvent;
import event_dispatcher_2_warehouse.event.ClientPaidEvent;
import event_dispatcher_2_warehouse.model.Client;
import event_dispatcher_2_warehouse.model.Order;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Actor3_Accountant accountant = new Actor3_Accountant("Ania");
        Actor2_Cashier cashier = new Actor2_Cashier("Ela");
        Actor1_Seller seller = new Actor1_Seller("Małgosia");
        Actor4_Stockman stockman = new Actor4_Stockman("Zenon");

        Dispatcher.DISPATCHER.printAllActorsClassName();
        System.out.println();
        Dispatcher.DISPATCHER.printAllListenersName();
        System.out.println();

        Client client1 = new Client(1);
        Order order1 = new Order("flour", 15.00);
        Dispatcher.DISPATCHER.fireEvent(new ClientArrivedEvent(client1));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Dispatcher.DISPATCHER.fireEvent(new ClientOrderedEvent(client1, order1));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Dispatcher.DISPATCHER.fireEvent(new ClientPaidEvent(client1, order1));
    }
}
