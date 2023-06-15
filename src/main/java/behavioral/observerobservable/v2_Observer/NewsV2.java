package behavioral.observerobservable.v2_Observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NewsV2 {
    private String wiadomosc;
    private int priorytet;  // 0 - niski; 10 - max;
}
