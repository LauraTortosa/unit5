public class Segment {
    private Point startPoint, endPoint;

    public Segment() {
        startPoint = new Point();
        endPoint = new Point();
    }

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    /*
    public double module(Point startPoint, Point endPoint) {

    }*/

    public String toString() {
        return startPoint.toString() + " - " + endPoint.toString();
    }

    public void setOffset(int offX, int offY) {
        startPoint.setOffset(offX, offY);
        endPoint.setOffset(offX, offY);
    }

    public void setStartPoint(Point startPoint) { //modificar
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}
