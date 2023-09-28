public class PointTester {
    public static void main(String[] args) {
        System.out.println("-- TESTING CONSTRUCTORS AND GETTER METHODS --");
        Point p1 = new Point(10, 5);
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        Point p2 = new Point(12);
        System.out.println(p2.getX());
        System.out.println(p2.getY());

        Point p3 = new Point();
        System.out.println(p3.getX());
        System.out.println(p3.getY());

        System.out.println("-- TESTING SETTER, COORDINATE, QUADRANT METHODS --");
        System.out.println(p1.coordinate());
        System.out.println(p1.quadrant());
        p1.setX(-8);
        System.out.println(p1.coordinate());
        System.out.println(p1.quadrant());
        p1.setY(-14);
        System.out.println(p1.coordinate());
        System.out.println(p1.quadrant());
        p1.setX(7);
        System.out.println(p1.coordinate());
        System.out.println(p1.quadrant());
        p1.setX(0);
        System.out.println(p1.coordinate());
        System.out.println(p1.quadrant());
        p1.setY(0);
        System.out.println(p1.coordinate());
        System.out.println(p1.quadrant());
        p1.setX(13);
        System.out.println(p1.coordinate());
        System.out.println(p1.quadrant());
    }
}
