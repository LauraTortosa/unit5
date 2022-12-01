public class TestMyTriangle {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle(2,3,4,1,2,4);
        Triangle tri2 = new Triangle(new Point(1,4), new Point(2,1), new Point(2,1));

        System.out.println(tri1);
    }
}
