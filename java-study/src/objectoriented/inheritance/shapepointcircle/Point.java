package objectoriented.inheritance.shapepointcircle;

import java.io.IOException;
import java.sql.SQLException;

class Point {

    int x; // x 좌표
    int y; // y 좌표

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getLocation() {
        System.out.println(x + ", " + y);
    }
}
