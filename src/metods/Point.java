package metods;

import java.util.Objects;

public class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }



    public boolean equals(Point p) {
        return x == p.x &&
                y == p.y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
}
