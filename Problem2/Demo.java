package QAP3.Problem2;

public class Demo {
    public static void main(String[] args) {
        // Test Point class
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println("Point: " + p1);

        // Test MovablePoint class
        MovablePoint mp1 = new MovablePoint(2.5f, 3.5f, 1.0f, 1.5f);
        System.out.println("Initial MovablePoint: " + mp1);

        // Move the MovablePoint
        mp1.move();
        System.out.println("After moving: " + mp1);

        // Move again
        mp1.move();
        System.out.println("After moving again: " + mp1);
    }
}
