package QAP3.Problem4;


public class Demo {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shape[] shapes = {
            new Circle(5),                  
            new Ellipse(10, 5),           
            new Triangle(8, 6),          
            new EquilateralTriangle(4)     
        };

        // Print details of the shapes before scaling
        System.out.println("Before Scaling:");
        for (Shape shape : shapes) {
            shape.printDetails();
        }

       
        scaleShapes(shapes, 2.0); // Scaling by a factor of 2

        
        System.out.println("\nAfter Scaling:");
        for (Shape shape : shapes) {
            shape.printDetails();
        }
    }

    // Static method to scale all shapes in the array
    public static void scaleShapes(Shape[] shapes, double factor) {
        // Iterate over each shape and scale it if it's Scalable
        for (Shape shape : shapes) {
            if (shape instanceof Scalable) {
                ((Scalable) shape).scale(factor); 
            }
        }
    }
}

