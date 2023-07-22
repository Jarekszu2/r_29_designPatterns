package event_dispatcher_2_warehouse.event;

import event_dispatcher_2_warehouse.dispatcher.Dispatcher;
import event_dispatcher_2_warehouse.listener.IClientArrivedListener;
import event_dispatcher_2_warehouse.model.Client;
import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
public class ClientArrivedEvent implements IEvent {
    private Client client;
    @Override
    public void execute() {
        List<IClientArrivedListener> listeners = Dispatcher.DISPATCHER.getObjectsTheyImplementInterface(IClientArrivedListener.class);
        // wprowadzam sortowanie po nazwie klasy, żeby wymusić kolejność wykonywania operacji (seller, cashier, accountant, stockman)
        listeners.sort(Comparator.comparing(iClientArrivedListener -> iClientArrivedListener.getClass().getName()));
        for (IClientArrivedListener listener : listeners) {
            listener.clientArrived(client);
        }

    }
}
