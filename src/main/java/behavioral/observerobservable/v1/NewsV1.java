package behavioral.observerobservable.v1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NewsV1 {
    private String wiadomosc;
    private int priorytet;  // 0 - niski; 10 - max;
}
