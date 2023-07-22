package event_dispatcher_2_warehouse.dispatcher;

import event_dispatcher_2_warehouse.event.IEvent;
import org.apache.commons.lang3.ClassUtils;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public enum Dispatcher {
    DISPATCHER;

    private Map<Class<?>, List<Object>> listeners = new HashMap<>();    // mapa interfejs, lista obiektów, które go implementuja
    private ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public void register(Object o) {
        List<Class<?>> interfacesImplementBy_O = ClassUtils.getAllInterfaces(o.getClass());
        for (Class<?> interfaceName : interfacesImplementBy_O) {
            if (listeners.containsKey(interfaceName)){
                listeners.get(interfaceName).add(o);
            } else {
                listeners.put(interfaceName, new ArrayList<>());
                listeners.get(interfaceName).add(o);
                System.out.println();   // dla uniknięcia redundancji z pack: event_dispatcher
            }
        }
    }

    public <T> List<T> getObjectsTheyImplementInterface(Class<T> interfaceName) {
        return (List<T>) listeners.get(interfaceName);
    }

    public void printAllActorsClassName(){
        Set<Object> set = new HashSet<>();

        listeners.values()
                .forEach(set::addAll);

        List<Object> list = new ArrayList<>(set);
        list.sort(Comparator.comparing(o -> o.getClass().getName()));

        list.forEach(o -> System.out.println(o.getClass().getName()));
    }

    public void printAllListenersName(){
        List<Class<?>> list = new ArrayList<>(listeners.keySet());

        list.sort(Comparator.comparing(Class::getName));

        list.forEach(aClass -> System.out.println(aClass.getName()));
    }

    public void fireEvent(IEvent iEvent){ // submit(new Runnable)
        executorService.submit(iEvent::execute);
    }
}
