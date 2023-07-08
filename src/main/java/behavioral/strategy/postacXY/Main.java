package behavioral.strategy.postacXY;

import behavioral.strategy.postacXY.stylRuchu.MoveStyleDown;
import behavioral.strategy.postacXY.stylRuchu.MoveStyleRight;
import behavioral.strategy.postacXY.stylRuchu.MoveStyleRightAndDown;

import java.util.Scanner;

/*
aplikacja pokazuje ruch postaci: X; aktualną i poprzednią pozycję (red)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        Postac postac = new Postac();
        System.err.println("X - previous position");
        System.out.println("X - actual position");
        System.out.println();
        postac.printResult();
//        postac.setiMoveStyle(new MoveStyleRight());
        while (true) {
            System.out.println("Choose: r) right, d) down, s) right/down q) quit");
            char sign = scanner.next().toLowerCase().charAt(0);
            if (sign == 'r') {
                postac.setiMoveStyle(new MoveStyleRight());
                postac.action();
                postac.printResult();
            } else if (sign == 'd') {
                postac.setiMoveStyle(new MoveStyleDown());
                postac.action();
                postac.printResult();
            } else if (sign == 's') {
                postac.setiMoveStyle(new MoveStyleRightAndDown());
                postac.action();
                postac.printResult();
            } else if (sign == 'q') {
                break;
            }
        }
    }
}
