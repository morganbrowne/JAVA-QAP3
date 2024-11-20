package QAP3.Problem4;

// Cirlce class that repersents the subclass of Shape.java and Inplements Scalable.java
public class Circle extends Shape implements Scalable {
    private double radius;

    public Circle(double radius) {
        super("Circle"); // Call Constructor of the shape. 
        this.radius = radius;

    }
    //
    @Override
    public void scale(double factor) {
        this.radius *= factor;    
    }

    @Override 
    public void printDetails() {
        System.out.println(" Radius Of Circle: " + radius);
    }
    
}
