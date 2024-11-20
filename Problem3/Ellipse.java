package QAP3.Problem3;

public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(double axis1, double axis2) {
        super("Ellipse"); // Shape Constructor name "Ellipse"
        if (axis1 >= axis2) {
            this.a = axis1; // Assign the larger value to a 
            this.b = axis2; // Assign the smaller value to b
        } else {
            this.a = axis2; // Assign the larger value to a 
            this.b = axis1; // Assign the smaller value to b
        }

    }

    @Override 
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * (a * a + b * b) - (a - b) * (a -b) / 2);
    }
}
