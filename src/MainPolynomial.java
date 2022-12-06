public class MainPolynomial {
    public static void main(String[] args) {
        MyPolynomial poly1 = new MyPolynomial(3.0, 2.0,4.0,3.0);
        MyPolynomial poly2 = new MyPolynomial("poly.txt");
        System.out.println(poly2);
    }
}
