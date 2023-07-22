package event_dispatcher_2_warehouse.event;

import event_dispatcher_2_warehouse.dispatcher.Dispatcher;
import event_dispatcher_2_warehouse.listener.IClientOrderedListener;
import event_dispatcher_2_warehouse.model.Client;
import event_dispatcher_2_warehouse.model.Order;
import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
public class ClientOrderedEvent implements IEvent {

    private Client client;
    private Order order;

    @Override
    public void execute() {
        List<IClientOrderedListener> listeners = Dispatcher.DISPATCHER.getObjectsTheyImplementInterface(IClientOrderedListener.class);
        listeners.sort(Comparator.comparing(iClientOrderedListener -> iClientOrderedListener.getClass().getName()));
        for (IClientOrderedListener listener : listeners) {
            listener.clientOrdered(client, order);
        }

    }
}
