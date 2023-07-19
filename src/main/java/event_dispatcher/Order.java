package event_dispatcher;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Order {
    private String dish;
    private double price;
}
