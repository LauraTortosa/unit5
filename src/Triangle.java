public class Triangle {
    private Point v1, v2, v3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new Point(x1, y1);
        v2 = new Point(x2, y2);
        v3 = new Point(x3, y3);
    }

    public Triangle(Point p1, Point p2, Point p3) {
        v1 = p1;
        v2 = p2;
        v3 = p3;
    }

    public String toString() {
        return "Triangle @ " + v1 +", " + v2 + ", " + v3;
    }

    /*public double getPerimeter() {

    }*/

    public void printType() {

    }




}
