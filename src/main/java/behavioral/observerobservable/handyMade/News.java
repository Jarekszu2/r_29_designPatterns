package behavioral.observerobservable.handyMade;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class News {
    private String wiadomosc;
    private int priorytet;  // 0 - niski; 10 - max;
}
