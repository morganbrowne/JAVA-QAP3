package QAP3.Problem3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(4);
        shapes[1] = new Ellipse(4, 6);
        shapes[2] = new Triangle(5, 6, 7);
        shapes[3] = new EquilateralTriangle(5);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
