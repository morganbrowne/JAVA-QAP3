package QAP3.Problem4;

public class Ellipse extends Shape implements Scalable {
    private double a;  // The major axis (larger axis)
    private double b;  // The minor axis (smaller axis)

    // Constructor to initialize the ellipse with two axes
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");

        // Assigning the larger value to 'a' (major axis) and the smaller to 'b' (minor axis)
        if (axis1 >= axis2) {
            this.a = axis1;  
            this.b = axis2;  
        } else {
            this.a = axis2;  
            this.b = axis1;  
        }
    }

    // Implements the scale method to scale both axes by the given factor
    @Override
    public void scale(double factor) {
        this.a *= factor;  
        this.b *= factor;  
    }

    // Print details of the ellipse
    @Override
    public void printDetails() {
        System.out.println("Ellipse with major axis: " + a + " and minor axis: " + b);
    }
}
