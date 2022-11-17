import org.w3c.dom.css.Rect;

public class Rectangle extends Point {
    private int width; //ancho
    private int height; //largo

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }
    public Rectangle(Point p, int newWidth, int newHeight) {
        super(p.getX(), p.getY());
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(Point p1, Point p2) { //37

    }
    public String toString() {
        return super.toString() + " Widht = " + width + " Height = " + height;
    }

    public int getArea() {
        return width * height;
    }

    /*public Point getPoint() {
    }*/

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    public void setHeight(int newHeight) {
        height = newHeight;
    }





}
