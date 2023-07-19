package event_dispatcher.dispatcher;

import event_dispatcher.event.IEvent;
import org.apache.commons.lang3.ClassUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Dispatcher {
    private static Dispatcher ourInstance = new Dispatcher();

    public static Dispatcher getInstance() {
        return ourInstance;
    }

    private Map<Class<?>, List<Object>> listeners = new HashMap<>();
    private ExecutorService thread = Executors.newSingleThreadExecutor();

    // tworzę metodę register na dowolny Object
    // chcę sie dowiedzieć jakie są interfejsy obiektu
    // do tego służy klasa ClassUtils od Apache (dependency) i metoda getAllInterfaces
    public void register(Object o) {
        List<Class<?>> interfejsyImplementowanePrzezO = ClassUtils.getAllInterfaces(o.getClass());
        for (Class<?> interfejs : interfejsyImplementowanePrzezO) {
            if (listeners.containsKey(interfejs)){  // jeżeli interfejs jest już w mapie
                listeners.get(interfejs).add(o);    // dodajemy o do listy wartości klucza (interfejsu)
            } else { // jeżeli interfejsu nie ma w mapie, tworzę nowy element mapy, którego kluczem jest interfejs, a wartoscia nowa pusta lista
                listeners.put(interfejs, new ArrayList<>());
                listeners.get(interfejs).add(o);    // na koniec dodajemy obiekt do listy dla danego interfejsu
            }
        }

    }

    // metoda, która dostarcza wszystke obiekty, które implementują dany interfejs
    public <T> List<T> getAllListenersOf(Class<T> tClass) {
        return (List<T>) listeners.get(tClass);
    }

    // ostatnia część dispatchera; dodaję pole: ExecutorService thread (pojedynczy wątek)
    public void fireEvent(IEvent iEvent){
        thread.submit(new Runnable() {
            @Override
            public void run() {
                iEvent.execute();   // wykonaj moje wydarzenie
            }
        });
    }

    private Dispatcher() {
    }
}
