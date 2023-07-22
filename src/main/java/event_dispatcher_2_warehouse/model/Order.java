package event_dispatcher_2_warehouse.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Order {
    private String name;
    private double price;
}
