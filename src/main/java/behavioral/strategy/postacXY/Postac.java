package behavioral.strategy.postacXY;

import behavioral.strategy.postacXY.stylRuchu.IMoveStyle;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Postac {
    private final static char POSTAC = 'X';
    private List<Coordinates> coordinates = new ArrayList<>(Arrays.asList(new Coordinates(1, 0)));
    private IMoveStyle iMoveStyle;

    public void setiMoveStyle(IMoveStyle iMoveStyle) {
        this.iMoveStyle = iMoveStyle;
        this.iMoveStyle.setPostac(this);
    }

    public void action() {
        iMoveStyle.move();
    }

    public void printResult() {
        System.out.println("**********************");
//        System.out.println("Size: " + coordinates.size() + ", x = " + coordinates.get(0).getX() + ", y = " + coordinates.get(0).getY()) ;
        if (coordinates.size() == 1) {
            System.out.println(POSTAC);
        } else {
            int xActual = coordinates.get(coordinates.size() - 1).getX();
            int yActual = coordinates.get(coordinates.size() - 1).getY();
            int xPrevious = coordinates.get((coordinates.size() - 2)).getX();
            int yPrevious = coordinates.get((coordinates.size() - 2)).getY();
//            System.out.println(xActual + " " + yActual + " " + xPrevious + " " + yPrevious);

            if (yActual == yPrevious) {
                for (int i = 0; i < yActual; i++) {
                    System.out.println(" ");
                }
                for (int i = 0; i < xPrevious; i++) {
                    if (i == (xPrevious - 1)) {
                        System.err.print(POSTAC);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(POSTAC);
            } else {
                if (xActual == xPrevious) {
//                    System.out.println("równe");
                    for (int i = 0; i < yPrevious; i++) {
                        System.out.println(" ");
                    }
//                    System.out.println("jestem1");
                    if (xActual == 1) {
                        System.err.println(POSTAC);
                        System.out.println(POSTAC);
                    } else {
                        printMoveRightAndDown(xActual, xPrevious);
                    }
                } else {
//                    System.out.println("--- s ---");
                    printMoveRightAndDown(xActual, xPrevious);
                }
            }
        }
    }

    private void printMoveRightAndDown(int xActual, int xPrevious) {
        for (int i = 0; i < xPrevious; i++) {
            if (i == (xPrevious - 1)) {
                System.err.println(POSTAC);
            } else {
                System.out.print(" ");
            }
        }
        for (int i = 0; i < xActual; i++) {
            if (i == (xActual - 1)) {
                System.out.println(POSTAC);
            } else {
                System.out.print(" ");
            }
        }
    }
}
