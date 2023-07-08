package behavioral.strategy.postacXY.stylRuchu;

import behavioral.strategy.postacXY.Coordinates;

public class MoveStyleRightAndDown extends IMoveStyle {
    @Override
    public void move() {
        int x = postac.getCoordinates().get(postac.getCoordinates().size() - 1).getX();
        int y = postac.getCoordinates().get(postac.getCoordinates().size() - 1).getY();
        postac.getCoordinates().add(new Coordinates((x +1), (y + 1)));
    }
}
