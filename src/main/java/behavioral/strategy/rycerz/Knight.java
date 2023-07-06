package behavioral.strategy.rycerz;

import lombok.Data;

@Data
public class Knight {
    private String name;
    private I_Strategy i_strategy;

    public Knight(String name) {
        this.name = name;

//        Sword sword = new Sword();
        this.i_strategy = new Sword();
    }

    public void walka(){
        i_strategy.walcz();
    }

    public void zmianaBroni(I_Strategy i_strategy) {
        setI_strategy(i_strategy);
    }
}
