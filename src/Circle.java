// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Circle {
    double radius;
    public Circle(double circleRadius) {
        radius = circleRadius;
    }
    public void circleArea() {
        System.out.println("A circle with radius " + radius + " has an area of " + (radius * radius * Math.PI));
    }
}