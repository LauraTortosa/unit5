public class Main4 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println(rect1);
        rect1.moveTo(4,7);
        System.out.println(rect1);

        Rectangle rect2 = new Rectangle(new Point(1,1), 8, 6);
        System.out.println(rect2);

    }
}
