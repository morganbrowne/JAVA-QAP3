package QAP3.Problem4;

public class Triangle extends Shape implements Scalable {
    protected double base;
    protected double height;

    public Triangle(double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public void scale(double factor) {
        this.base *= factor;
        this.height *= factor;
    }

    @Override
    public void printDetails() {
        System.out.println("Triangle With base " + base + " And Height: " + height);
    }
}
