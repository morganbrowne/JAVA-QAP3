package QAP3.Problem4;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side);
    }

    @Override
    public void scale(double factor) {
        this.base *= factor;
        this.height *= factor;
    }

    @Override 
    public void printDetails() {
        System.out.println("Equialteral Triangle with side: " + base);
    }
}
