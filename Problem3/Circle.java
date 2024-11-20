package QAP3.Problem3;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle"); // Calling shape constructor to set name a circle.
        this.radius = radius;

            
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
