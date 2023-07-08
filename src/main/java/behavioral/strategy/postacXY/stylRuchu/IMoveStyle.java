package behavioral.strategy.postacXY.stylRuchu;

import behavioral.strategy.postacXY.Postac;

public abstract class IMoveStyle {
    protected Postac postac;

    public void setPostac(Postac postac) {
        this.postac = postac;
    }

    public abstract void move();
}
