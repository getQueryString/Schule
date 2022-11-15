package StdDraw;

import java.awt.*;

public class TestDraw {

    private static final double rw = .5;

    public static void main(String... args) {
        setColorToGroup();

        StdDraw.setXscale(0, 20);  // die x-Koordinaten des Fensters gehen von 0 bis 20
        StdDraw.setYscale(0, 20);  // die y-Koordinaten des Fensters gehen von 0 bis 20

        StdDraw.setPenColor();
        StdDraw.setPenRadius();
        StdDraw.line(10, 10, 50, 50);

        StdDraw.filledSquare(8, 8, 5);

        drawFilledEllipses();

        StdDraw.setRandomPenColor();

        StdDraw.filledSquare(2.5, 8.5, 1.5);
        StdDraw.filledSquare(0.5, 8.5, rw);
        StdDraw.filledSquare(4.5, 8.5, rw);

        StdDraw.setRandomPenColor();
        StdDraw.filledRectangle(2.5, 5.5, rw, 1.5);

        StdDraw.setRandomPenColor();
        StdDraw.filledRectangle(5, 2, 5, 2);

        StdDraw.setRandomPenColor();
        StdDraw.filledRectangle(6.5, 4, 2.5, 1);

        StdDraw.setRandomPenColor();
        StdDraw.filledRectangle(7, 5.5, 2, rw);
        StdDraw.filledRectangle(9.5, 3, rw, 2);
        StdDraw.filledRectangle(5, 2, 4, 1);     //die "halben" Raeder werden spaeter ueberschrieben
        StdDraw.filledRectangle(7.5, 4, rw, 1);
        StdDraw.filledSquare(3.5, 3.5, rw);
        StdDraw.filledSquare(4.5, 4.5, rw);

        StdDraw.setRandomPenColor();
        StdDraw.filledSquare(3, 1, 1);
        StdDraw.filledSquare(8, 1, 1);

        StdDraw.show();
    }

    private static void setColorToGroup() {
        StdDraw.colorToGroup.add(Color.BLUE);
        StdDraw.colorToGroup.add(Color.BLACK);
        StdDraw.colorToGroup.add(Color.RED);
        StdDraw.colorToGroup.add(Color.GRAY);
        StdDraw.colorToGroup.add(Color.YELLOW);
    }

    private static void drawFilledEllipses() {
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                StdDraw.setRandomPenColor();
                StdDraw.filledEllipse(i + 4, i1 + 10, .2, .4);
            }
        }
    }
}