package behavioral.observerobservable.v3_SimpleObjectProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NewsV3 {
    private String wiadomosc;
    private int priorytet;  // 0 - niski; 10 - max;
}
