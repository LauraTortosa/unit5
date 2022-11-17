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

    public String toString() {
        return super.toString() + " Widht = " + width + " Height = " + height;
    }


}
