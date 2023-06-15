package behavioral.observerobservable.handyMade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Watcher {
    private int poziomZainteresowania;
    private String imie;

    public void notifyAboutNews(News news) {
        if (news.getPriorytet() > poziomZainteresowania) {
            System.err.println(imie + ": OMG! O nie! " + news.getWiadomosc());
        } else {
            System.out.println(imie + ": Etam, co mie to... - " + news.getWiadomosc());
        }
    }
}
